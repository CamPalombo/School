package school;
public class Student extends Person{
    private int gradeLevel;
//    private Course theCourse;
    private Course courses[] = new Course[Course.numPeriods];
    private double gradeScore[] = new double[Course.numPeriods];
    
    public static Student addStudent(String _name,
    Gender _gender, int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        addPerson(temp);
        return(temp);
    }    
    Student (String _name,Gender _gender,int _weight,
    int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    }
    
    public boolean addCourse(Course _course, double _grade)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course, _grade);
        return(true);
    }  
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);
        if (courses[_course.getPeriod()-1] != null)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course, double _grade)
    {
        courses[_course.getPeriod()-1]=_course;
        gradeScore[_course.getPeriod()-1] = _grade;
    }
    
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    }  
    public void setGrade(double _grade, int period)
    {
        gradeScore[period] = _grade;
    }
    public double getGPA()
    {
        double gpa = 0.0;
        int numCourse = 0;
        for(int index = 0;index < Course.numPeriods - 1; index ++)
        {
            if(courses[index] != null)
            {
                numCourse++;
                gpa += gradeScore[index];
            }
        }
        return(gpa/numCourse);
    }
    public double getHighestGPA()
    {
        double gpa = 0.0;
        Student stu = null;
        for (Person temp : people)
        {
            if(temp instanceof Student)
            {
                Student student = (Student)temp;
                if(student.getGPA() > gpa)
                {
                    gpa = student.getGPA();
                    stu = student;
                }
            }
        }
//        System.out.println(stu.getName() + " " + stu.getGPA());
        return(gpa);
    }
    public static void printNames()
    {
        System.out.println("============");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    } 
    public void printTeachersName()
    {
        System.out.println("============");
        System.out.println(getName() + " taught by ");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if(temp.getTeacher() != null)
                {
                    System.out.print(temp.getTeacher().getName());
                }
            }
        }
    }
    public static void printNamesGPAGreaterThan(double _gpa)
    {
        System.out.println("============");
        System.out.println("Student with GPA greater than " + _gpa + ": ");
        for (Person temp : people)
        {
            if(temp instanceof Student)
            {
                Student student = (Student)temp;
                if(student.getGPA() > _gpa)
                    System.out.println(temp.getName());
            }
        }
    }
}
