package OOP.Lesson5ClassesAndObjects.Task1;

import java.util.Scanner;

public class Start{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double Length = sc.nextDouble();
        double Width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(Length, Width);
        rectangle.printRectangle();
        rectangle.Square();
    }
}
