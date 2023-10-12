package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Tobias");
        Student s2 = new Student("Henrik");
        s1.addCourse("Java 1.0");
        s2.addCourse("Programming");

        s1.addHasPassed("Java 1.0");
        s2.addHasPassed("Math-A");

        Teacher t1 = new Teacher("Signe");
        Teacher t2 = new Teacher("Jesper");
        t1.addCanteach("Math-A");
        t2.addCanteach("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).addCourse("Java 1.0");
        }


    }
}
