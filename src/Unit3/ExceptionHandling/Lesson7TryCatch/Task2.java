//Напишите программу, которая создает массив из 5 целых чисел.
//Введите индексы для доступа к элементам массива через пользовательский ввод.
//Если пользователь пытается обратиться к индексу, который выходит за пределы массива,
//перехватите это исключение и выведите сообщение о неверном индексе.
//В блоке finally выведите сообщение, что операция завершена.
package Unit3.ExceptionHandling.Lesson7TryCatch;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Введите 10 целых чисел:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt(); // Заполняем массив
        }

        try {
            System.out.print("Введите индекс для доступа к элементу массива: ");
            int index = sc.nextInt();
            System.out.println("Элемент по индексу " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс выходит за пределы массива!");
        } finally {
            System.out.println("Операция завершена.");
            sc.close();
        }
    }
}

