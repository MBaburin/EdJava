///Напиши программу, которая с помощью цикла for выводит чётные числа от 1 до 100

package Сore.Lesson3Cycles;

public class Task2 {
    public static void main(String[] args){
        for(int i = 1; i <101; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
