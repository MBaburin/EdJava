//Пользователь вводит N чисел, программа сохраняет их в ArrayList.
// Затем нужно удалить все нечётные числа и вывести список.

package Unit4.Collections.Lesson12ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер коллекции");
        int n = sc.nextInt();
        System.out.println("В коллекции " + n + " элементов");

        System.out.println("Заполните коллекцию числами");
        ArrayList <Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        list.removeIf(num -> num % 2 != 0);

        System.out.println(list);
    }
}
