//Напишите программу, которая запрашивает у пользователя пароль. Если пароль короче 8 символов,
//программа должна выбросить исключение IllegalArgumentException с сообщением:
//"Ошибка: пароль слишком короткий! Минимальная длина — 8 символов."
//Если пароль соответствует требованиям, программа выводит:
//"Пароль принят!"

package Unit3.ExceptionHandling.Lesson8ThrowNewException;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль");
        try {
            String Password = sc.nextLine();
            if (Password.isEmpty()) {
                throw new IllegalArgumentException("Ошибка: пароль не может быть пустым!");
            }
            if (Password.length() < 8) {
                throw new IllegalArgumentException("Ошибка: пароль слишком короткий! Минимальная длина — 8 символов.");
            }
            System.out.println("Пароль принят!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
