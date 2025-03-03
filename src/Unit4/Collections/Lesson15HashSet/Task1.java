//Создай программу, которая принимает N номеров пользователей (целые числа) и сохраняет их в HashSet.
//Затем выведи количество уникальных номеров.

package Unit4.Collections.Lesson15HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> collection = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            collection.add(sc.nextInt());
        }
        System.out.println(collection);
    }
}
