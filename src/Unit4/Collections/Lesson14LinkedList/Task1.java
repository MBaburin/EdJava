//Создай программу, которая использует LinkedList для управления очередью клиентов в банке.
//Условия:
//    Пользователь вводит количество клиентов.
//    Затем вводит их имена.
//    Программа должна обработать очередь:
//        Вывести список клиентов.
//        Удалить первого клиента из очереди (обслужен).
//        Вывести обновлённый список.


package Unit4.Collections.Lesson14LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество клиентов");
        int a = sc.nextInt();
        sc.nextLine();


        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i <= a; i++) {
            list.add(sc.nextLine());
        }
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
