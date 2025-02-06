//Напиши программу, которая:
//    Создаёт массив из 10 элементов.
//    Заполняет его случайными числами от 1 до 100.
//    Считает сумму всех элементов.
//    Выводит массив и сумму.

package Lesson4Arrays;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
