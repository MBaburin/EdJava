package OOP.Lesson5ClassesAndObjects.Task2;

import java.util.Scanner;

public class Start{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        Person person1 = new Person(name, age);
        person1.printPerson();
    }
}
