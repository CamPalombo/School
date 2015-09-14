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
}
