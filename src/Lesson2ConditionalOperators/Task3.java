//Напиши программу, которая проверяет, является ли введенный год високосным. Високосный год — это год, который делится на 4, но не делится на 100, если только он не делится на 400.
package Lesson2ConditionalOperators;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}
