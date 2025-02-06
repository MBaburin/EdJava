package OOP.Lesson6.Interfaces.Task3;

public class Start {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle(5, 6);
        r.area();
        r.perimeter();
    }
}
