//Описание задачи:
//Напишите программу, которая пытается преобразовать строку в объект типа Date с помощью класса SimpleDateFormat.
//Если строка не соответствует формату даты, выбрасывается исключение ParseException. Это исключение нужно обработать.

package Unit3.ExceptionHandling.Lesson10CheckedExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String Striated = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("d MM yyyy");
            Date date = format.parse(Striated);
            System.out.println(date);
        }catch (ParseException e) {
            System.out.println("Неправильный формат даты");
        }
    }
}
