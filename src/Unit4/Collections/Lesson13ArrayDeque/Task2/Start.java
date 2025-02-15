//Напиши программу, которая:
//    Принимает N чисел от пользователя и сохраняет их в ArrayDeque<Integer>.
//    Затем выводит эти числа в обратном порядке, используя возможности ArrayDeque.

package Unit4.Collections.Lesson13ArrayDeque.Task2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayDeque<Integer> numbers = new ArrayDeque<>(n);

        for (int i = 0; i < n; i++) {
            numbers.addLast(sc.nextInt());
        }
        System.out.println(numbers);
        while (!numbers.isEmpty()) {
            System.out.println(numbers.removeLast()); // Удаляем с конца
        }
    }
}
