//Создаёт две очереди чисел (ArrayDeque<Integer>), вводимых пользователем.
//Затем объединяет их в одну очередь, добавляя элементы попеременно:
//    Первый элемент из первой очереди
//    Первый элемент из второй очереди
//    Второй элемент из первой очереди
//    Второй элемент из второй очереди и так далее...
//Если одна очередь длиннее, её оставшиеся элементы просто добавляются в конец.

package Unit4.Collections.Lesson13ArrayDeque.Task3;

import java.util.ArrayDeque;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        ArrayDeque<Integer> array1 = new ArrayDeque<>(5);
        ArrayDeque<Integer> array2 = new ArrayDeque<>(5);
        ArrayDeque<Integer> array3 = new ArrayDeque<>(10);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            array1.addLast(random.nextInt(100));
            array2.addLast(random.nextInt(100));
        }
        System.out.println("Коллекция 1 " + array1);
        System.out.println("Коллекция 2 " + array2);

        for (int i = 0; i < 5; i++) {
            if (!array1.isEmpty()) array3.addLast(array1.poll());
            if (!array2.isEmpty()) array3.addLast(array2.poll());
        }
        System.out.println("Коллекция 3 " + array3);
    }
}
