//Напиши программу, которая принимает N чисел от пользователя и сохраняет их в HashSet.
//Затем программа должна проверить, есть ли в HashSet число, введённое пользователем, и вывести соответствующее сообщение.

package Unit4.Collections.Lesson15HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashSet<Integer> collection = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();

        System.out.println("Заполните коллекцию числами:");
        for (int i = 0; i < n; i++) {
            collection.add(sc.nextInt());
        }

        System.out.println("Введите число для проверки:");
        int checkNumber = sc.nextInt();

        if (collection.contains(checkNumber)) {
            System.out.println("Число " + checkNumber + " есть в коллекции!");
        } else {
            System.out.println("Число " + checkNumber + " отсутствует в коллекции.");
        }
    }
}