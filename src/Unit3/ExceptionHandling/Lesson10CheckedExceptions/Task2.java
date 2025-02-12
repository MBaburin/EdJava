//Описание задачи:
//Напишите метод, который принимает два числа для деления.
//Если одно из чисел отрицательное, выбрасывается исключение IllegalArgumentException.
//Это исключение нужно обработать в методе main.
package Unit3.ExceptionHandling.Lesson10CheckedExceptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            if (b < 0){
                throw new ArithmeticException("b не может быть меньше 0");
            }
            System.out.println(c);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
