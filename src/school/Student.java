package school;

import java.util.ArrayList;

public class Student extends Person {
    
    private int gradelevel;
    private Course theCourse;
    private Student theStudent;
    
    private static ArrayList<Student> student = new ArrayList<Student>();
    
    public static Student addStudent(String _name, Gender _gender, int _weight, int _day, int _month, int _year, int _gradelevel)
    {
        Student temp = new Student (_name,_gender,_weight,_day,_month,_year,_gradelevel);
        addPerson(temp);
        return(temp);
    }
    
    Student(String _name, Gender _gender, int _weight,int _day, int _month, int _year, int _gradelevel)
    {
        super(_name,_gender,_weight,_day,_month,_year);
        gradelevel = _gradelevel;
    }
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            _course.addStudent(this);

        }
    }
     public void addStudent(Student _student)
    {
        if(theStudent == null)
        {
            theStudent = _student;
            _student.addCourse(this);
        }
    }
    public void setGradelevel(int _gradelevel)
    {
        gradelevel = _gradelevel;
    }
    public int getGradelevel()
    {
        return(gradelevel);
    }
    public static void printName()
    {
        System.out.println("==========");
        for( Person temp : people)
            {
                if(temp instanceof Student)
                System.out.println(temp.getName());
            }

    }
    
    
    
}
