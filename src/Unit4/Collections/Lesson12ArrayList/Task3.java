package Unit4.Collections.Lesson12ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер коллекции");
        int n = sc.nextInt();
        System.out.println("В коллекции " + n + " элементов");

        System.out.println("Заполните коллекцию числами");
        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Исходная коллекция" + list);

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Минимальное число " + min + " Максимальное число " + max);
    }
}
