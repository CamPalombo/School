/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
public class School {
    public static void main(String[] args) {
        
        Person Joe = Person.addPerson("Joe",Person.Gender.Male,120);
        Person Jill = Person.addPerson("Jill",Person.Gender.Female,150);
        Person Fats = Person.addPerson("Fats",Person.Gender.Male,9000000);
        Person Uber = Person.addPerson("Ubermensch",Person.Gender.Male,145);
        Person.printName(Person.Gender.Male);
    }
}
