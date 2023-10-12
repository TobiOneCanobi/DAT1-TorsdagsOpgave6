package Task4;

 class Circle implements Shape {

    double radius;
     double pi = 3.14;

     Circle(double radius)
     {
         this.radius = radius;
     }

     public double getArea()
     {
        return pi*(radius*radius);
     }
 }
