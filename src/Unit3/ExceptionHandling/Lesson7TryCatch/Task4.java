//Напишите программу, которая запрашивает у пользователя два числа:
//основание и показатель степени.
//Затем программа должна вычислить результат возведения в степень.
//Если пользователь вводит не число, программа должна обработать исключение и вывести сообщение об ошибке.

package Unit3.ExceptionHandling.Lesson7TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 1;
            for (int i = 0; i < b; i++) {
                c *= a;
            }
            System.out.println(c);
        } catch (InputMismatchException e) {
            System.out.println("Баг ввода");
        }
        finally {
            System.out.println("Завершение операции");
            sc.close();
        }
    }

}
