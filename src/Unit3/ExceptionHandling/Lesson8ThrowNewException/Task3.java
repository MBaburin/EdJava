//Напишите программу, которая запрашивает у пользователя два числа: делимое и делитель.
// Затем программа должна выполнить деление.

package Unit3.ExceptionHandling.Lesson8ThrowNewException;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        finally {
            sc.close();
        }
    }
}
