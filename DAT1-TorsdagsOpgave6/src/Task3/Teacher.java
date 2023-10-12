package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();


    Teacher(String name) {
        super(name);
        this.canTeach = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            System.out.println("Teacher: " + getName() + " can teach " + course + ", added the course");
            return true;
        } else {
            System.out.println("Teacher: " + getName() + " is not qualified to teach " + course);
            return false;
        }
    }

    public boolean addCanteach(String course)
    {
        if(canTeach.contains(course))
        {
            return false;
        }
        else
        {
            canTeach.add(course);
            return true;
        }
    }
}
