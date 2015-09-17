package school;
import java.util.ArrayList;
import java.util.Calendar;
public class Person {
    enum Gender {
        Male, Female;
    }
    private static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    private int bday;
    private int bmonth;
    private int byear;
    
    public void setBirthdate(int _day, int _month, int _year)
    {
        bday =_day;
        bmonth = _month;
        byear = _year;
    }
    public int getAge()
    {
        Calendar now =Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        year--;
        if(bmonth < month)
            year++;
        else if(bmonth == month)
        {
            if(bday <= day)
                year++;
        }
        int age = year - byear;
        return(age);
    }
    public static Person addPerson(String _name, Gender _gender, int _weight, int _day, int _month, int _year)
    {
        Person temp = new Person (_name,_gender,_weight,_day,_month,_year);
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name = "None";
        gender = Gender.Male;
        weight = 0;
    }
    Person(String _name, Gender _gender, int _weight, int _day, int _month, int _year)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
        bday = _day;
        bmonth = _month;
        byear = _year;
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
                System.out.println(temp.getName() + ", "+ temp.weight+"lb, Age: " + temp.getAge());
            }

    }
}
