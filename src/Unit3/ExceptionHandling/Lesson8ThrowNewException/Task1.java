//Напишите программу, которая запрашивает у пользователя его возраст.
// Если возраст меньше 18 лет, программа должна выбрасывать исключение Exception с сообщением
// "Ошибка: доступ запрещен! Минимальный возраст — 18 лет.".
//Если возраст 18 и больше, программа выводит "Доступ разрешен!".

package Unit3.ExceptionHandling.Lesson8ThrowNewException;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Введите  ваш возраст");
            int age = sc.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("Ошибка: доступ запрещен! Минимальный возраст — 18 лет.");
            }
            System.out.println("Добро пожаловать");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
