//Напиши программу, которая проверяет, является ли введенное число четным или нечетным. Используй оператор if-else.

package Lesson2ConditionalOperators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a % 2 == 0){
            System.out.print("Число чётное");
        }
        else{
            System.out.print("Число нечётное");
        }
    }
}