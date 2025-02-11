package Unit2.OOP.Lesson6.Interfaces.Task3;

public class Circle implements Shape {
    int radius;
    double p = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(" ");
        System.out.println(" Circle area is " + radius * p * p);
    }

    @Override
    public void perimeter() {
        System.out.println(" ");
        System.out.println(" Circle perimeter area is " + 2 * radius * p);
    }
}
