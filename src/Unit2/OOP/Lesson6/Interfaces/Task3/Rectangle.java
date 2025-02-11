package Unit2.OOP.Lesson6.Interfaces.Task3;

public class Rectangle implements Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println(" ");
        System.out.println(" Area of Rectangle is " + length * width);
    }

    @Override
    public void perimeter() {
        System.out.println(" ");
        System.out.println(" Area of Rectangle is " + 2 * (length + width));
    }
}
