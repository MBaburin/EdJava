//Напиши программу, которая берет два числа типа double, преобразует их в int, и выводит результат их сложения.
package Lesson1JavaTypes;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        int c = (int) a;
        int d = (int) b;

        System.out.println(c + d);
    }
}