//Напишите программу, которая запрашивает у пользователя температуру воды (в градусах Цельсия).

package Unit3.ExceptionHandling.Lesson8ThrowNewException;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Введите температуру воды:");
            int t = sc.nextInt();
            if (t < 0) {
                throw new IllegalArgumentException("Температура воды не может быть меньше 0");
            }
            if (t > 100) {
                throw new IllegalArgumentException("Температура воды не может быть больше 100");
            }
            System.out.println("Температура воды " + t);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
