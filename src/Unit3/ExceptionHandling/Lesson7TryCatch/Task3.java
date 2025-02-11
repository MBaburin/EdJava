//Напишите программу, которая запрашивает у пользователя целое число и проверяет, является ли оно четным.
//Если пользователь вводит не число, программа должна обработать исключение и вывести сообщение об ошибке.

package Unit3.ExceptionHandling.Lesson7TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечётное");
            }
        } catch (InputMismatchException e) {
            System.out.println("Баг ввода");
        }
        finally {
            System.out.println("Завершение операции");
        }
    }
}
