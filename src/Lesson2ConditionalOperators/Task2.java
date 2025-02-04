//Напиши программу, которая принимает два числа и выводит большее из них. Если числа равны, вывести "Числа равны".

package Lesson2ConditionalOperators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a > b){
            System.out.println(a);
            System.out.println("Больше");
        }
        else if(b > a){
            System.out.println(b);
            System.out.println("Больше");
        }
        else{
            System.out.println("Числа равны");
        }
    }
}