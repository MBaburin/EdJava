//Напиши программу, которая:
//    Создаёт массив из 10 случайных чисел.
//    Находит максимальный и минимальный элементы.
//    Выводит массив, минимальное и максимальное значения.

package Lesson4Arrays;

import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        int[] Array = new int[10];
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < Array.length; i++){
            int randomNum = rand.nextInt(100);
            Array[i] = randomNum;
            sum += Array[i];
            System.out.println( Array[i]) ;
        }
        System.out.println("Сумма элементов массива " + sum );
    }
}
