package OOP.Lesson5ClassesAndObjects.Task1;

public class Rectangle {
    private double Length;
    private double Width;

    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }

    public void printRectangle(){
        System.out.println("Length: " + Length);
        System.out.println("Width: " + Width);
    }

    public void Square(){
        System.out.println("Square of rectangle " + Length * Width);
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }
}