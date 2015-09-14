package school;
import java.util.ArrayList;
public class Course {
    enum Type{
        Math,Science,English,History,PE,Language,Elective;
    }
    private static ArrayList<Course> course = new ArrayList<Course>();
    private Type type;
    private String name;
    private int period;
    public static Course addCourse(String _name, Type _type, int _period)
    {
        Course temp = new Course (_name,_type,_period);
        course.add(temp);
        return(temp);
    }
    Course()
    {
        name = "None";
        type = Type.Math;
        period = 1;
    }
    Course(String _name, Type _type, int _period)
    {
        name = _name;
        type = _type;
        period = _period;
    }
     public void setName(String _name)
    {
        name = _name;
    }
    public void setPeriod(int _period)
    {
        period = _period;
    }
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type getType()
    {
        return(type);
    }
    public int getPeriod()
    {
        return(period);
    }
    public String getName()
    {
        return(name);
    }
    public static void printClass(Course.Type _type)
    {
        System.out.println("==========");
        for( Course temp : course)
            {
                if(temp.type == _type)
                System.out.println(temp.getName() + " Period: "+ temp.period);
            }

    }
    public static void printClasses()
    {
        System.out.println("==========");
        for( Course temp : course)
            {
                System.out.println(temp.getName() + " Period: "+ temp.period);
            }

    }
}
