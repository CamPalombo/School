package school;
import java.util.ArrayList;
public class Person {
    enum Gender {
        Male, Female;
    }
    private static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp = new Person (_name,_gender,_weight);
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name = "None";
        gender = Gender.Male;
        weight = 0;
    }
    Person(String _name, Gender _gender, int _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }
    public int getWeight()
    {
        return(weight);
    }
    public String getName()
    {
        return(name);
    }
    public static void printName(Gender _gender)
    {
        System.out.println("==========");
        for( Person temp : people)
            {
                if(temp.gender == _gender)
                System.out.println(temp.getName() + " "+ temp.weight+"lb");
            }

    }
}
