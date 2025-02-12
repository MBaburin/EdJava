//Описание задачи: Напишите метод, который принимает массив целых чисел и индекс.
//Метод должен вернуть элемент массива по указанному индексу.
//Если индекс выходит за пределы массива, выбрасывается исключение ArrayIndexOutOfBoundsException, которое является непроверяемым.
//Обработайте это исключение в методе main и выведите сообщение, если индекс неверен.

package Unit3.ExceptionHandling.Lesson9UncheckedExceptions;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        try {
            int[] Array = new int[10];
            for (int i = 0; i < Array.length; i++){
                int randomNum = rand.nextInt(100);
                Array[i] = randomNum;
            }
            int a = sc.nextInt();
            System.out.println(Array[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за пределы массива");
        }
    }
}
