//Напиши программу, которая на основе введенного балла от 0 до 100 выводит оценку по шкале:
//90 и выше — "Отлично"
//70-89 — "Хорошо"
//50-69 — "Удовлетворительно"
//Ниже 50 — "Неудовлетворительно"
package Unit1.Сore.Lesson2ConditionalOperators;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("Нет такой оценки");
        } else if (a >= 90) {
            System.out.println("Отлично");
        } else if (a >= 70) {
            System.out.println("Хорошо");
        } else if (a >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
