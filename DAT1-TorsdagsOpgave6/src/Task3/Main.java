package Task3;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> passedCourses = new ArrayList<>();
        ArrayList<String> canTeach = new ArrayList<>();
        Student s1 = new Student("Tobias");
        Student s2 = new Student("Henrik");
        s1.addCourse("Java 1.0");
        s2.addCourse("Programming");

        Teacher t1 = new Teacher("Signe", canTeach);
        Teacher t2 = new Teacher("Jesper", canTeach);
        t1.addCourse("Programming");
        t2.addCourse("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

        for(int i = 0; i < persons.size(); i++ )
        {
            persons.get(i).addCourse("Java 1.0");
        }


    }
}
