//Напиши программу, которая запрашивает у пользователя число N и с помощью цикла for вычисляет его факториал.

package Unit1.Сore.Lesson3Cycles;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        for(int i =1; i <n; i++){
            sum *= i;
        }
        System.out.println(" Число " + n + " Факториал " + sum);
        sc.close();
    }
}
