//Напиши программу, которая запрашивает у пользователя число N и с помощью цикла for находит сумму всех чисел от 1 до N.

package Unit1.Сore.Lesson3Cycles;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i =1; i <a; i++){
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
        sc.close();
    }
}
