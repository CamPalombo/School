package school;
public class School {
    public static void main(String[] args) {
        
        Course Math = Course.addCourse("Math", Course.Type.Math, 1);
        Course English = Course.addCourse("English", Course.Type.English, 2);
        Course Science = Course.addCourse("Science", Course.Type.Science, 3);
        Course PE = Course.addCourse("PE", Course.Type.PE, 4);
        Course Elective = Course.addCourse("Elective", Course.Type.Elective, 5);
        Person Joe = Person.addPerson("Joe",Person.Gender.Male,120,6,6,2000);
        Person Jill = Person.addPerson("Jill",Person.Gender.Female,115,8,11,2000);
        Person Fats = Person.addPerson("Fats",Person.Gender.Male,9000000,8,8,2000);
        Person Uber = Person.addPerson("Ubermensch",Person.Gender.Male,145,17,9,1995);
        Person.printName(Person.Gender.Male);
        Course.printClasses();
        Course.printClass(Course.Type.PE);
        
        Student bobby =
        Student.addStudent("Bobby",Person.Gender.Male,1,1,1,1,1);
        Student.addStudent("Bobby",Person.Gender.Male,1,1,1,1,1);
     //   Student bobby = new Student ("Bobby",Person.Gender.Male,168,11,1,1,1);
        System.out.println(bobby.getName());
        Student.printName();
        
    }
}
