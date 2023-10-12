package Task3;

import java.util.ArrayList;

public class Student extends Person
{
   ArrayList<String> passedCourses = new ArrayList<>();
   ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name)
    {
        super(name);
        this.passedCourses = new ArrayList<>();

    }

    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course))
        {
            System.out.println("can't add course already passed");
            return false;
        }
        else
        {
            currentCourses.add(course);
            return true;
        }
    }
}
