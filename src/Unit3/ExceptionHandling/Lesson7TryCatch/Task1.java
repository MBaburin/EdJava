//Напишите программу, которая принимает два числа от пользователя и делит первое число на второе.
//Используйте блоки try, catch и finally для обработки ошибок.
//Если второе число равно нулю, программа должна обработать исключение и вывести сообщение о невозможности деления на ноль.
//В блоке finally выведите сообщение о завершении операции.

package Unit3.ExceptionHandling.Lesson7TryCatch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Частное равно = " + a / b);
        }
        catch(ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        catch(Exception e) {
            System.out.println("Ошибка ввода");
        }
        finally {
            System.out.println("Операция завершена");
        }
    }
}
