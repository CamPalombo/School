/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
public class School {
    public static void main(String[] args) {
        
        Course Math = Course.addCourse("Math", Course.Type.Math, 1);
        Course English = Course.addCourse("English", Course.Type.English, 2);
        Course Science = Course.addCourse("Science", Course.Type.Science, 3);
        Course PE = Course.addCourse("PE", Course.Type.PE, 4);
        Course Elective = Course.addCourse("Elective", Course.Type.Elective, 5);
        Person Joe = Person.addPerson("Joe",Person.Gender.Male,120);
        Person Jill = Person.addPerson("Jill",Person.Gender.Female,150);
        Person Fats = Person.addPerson("Fats",Person.Gender.Male,9000000);
        Person Uber = Person.addPerson("Ubermensch",Person.Gender.Male,145);
        Person.printName(Person.Gender.Male);
        Course.printClasses();
        Course.printClass(Course.Type.PE);
        
        
    }
}
