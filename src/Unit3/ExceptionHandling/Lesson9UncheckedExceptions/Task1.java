//Описание задачи:
// Напишите программу, которая выполняет деление двух чисел.
// Если второе число равно нулю, выбрасывается исключение ArithmeticException.
// Это исключение является непроверяемым, и его нужно обработать в блоке try-catch.
// Программа должна поймать это исключение и вывести сообщение об ошибке.

package Unit3.ExceptionHandling.Lesson9UncheckedExceptions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно");
        }
    }
}