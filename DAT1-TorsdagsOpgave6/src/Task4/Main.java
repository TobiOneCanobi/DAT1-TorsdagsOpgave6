package Task4;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Square s1 = new Square(10,10);
        System.out.println("Circles area is: " + c1.getArea());
        System.out.println("Square area is: " + s1.getArea());
        ShapeBuilder sb = new ShapeBuilder();

        sb.addShape(c1);
        sb.addShape(s1);

        sb.getTotalArea();
        System.out.println("Total areas of shapes is: " + sb.getTotalArea());
    }
}
