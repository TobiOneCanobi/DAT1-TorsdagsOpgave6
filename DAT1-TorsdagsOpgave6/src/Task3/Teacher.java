package Task3;

import java.util.ArrayList;

public class Teacher extends Person
{
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();


    public Teacher(String name,ArrayList<String> canTeach)
    {
        super(name);
        this.canTeach = canTeach;
    }

    public boolean addCourse(String course) {
        if(canTeach.contains(course))
        {
            System.out.println("Teacher can teach this course");
            currentCourses.add(course);
            return true;
        }
        else
        {
            System.out.println("Teacher can't teach this course");
            return false;
        }
    }
}
