//Программа должна хранить заказы клиентов в LinkedList. Реализуй функционал:
//
//    Добавление нового заказа в конец списка.
//    Выдача (удаление) самого первого заказа.
//    Просмотр всех заказов.
//
//Ввод:
//
//    Сначала указывается количество заказов.
//    Затем вводятся названия блюд.
//    После ввода всех заказов пользователь может:
//        Нажать 1 — добавить новый заказ.
//        Нажать 2 — выдать (удалить) первый заказ.
//        Нажать 3 — просмотреть все заказы.
//        Нажать 4 — завершить работу программы


package Unit4.Collections.Lesson14LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> orders = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Укажите, что будет в заказе");
                    String order = sc.nextLine();
                    orders.addLast(order);
                    System.out.println("Заказ добавлен: " + order);
                    break;
                case 2:
                    System.out.println("Заказ выполенен ");
                    orders.removeFirst();
                    System.out.println(orders);
                    break;
                case 3:
                    System.out.println("Список заказов");
                    System.out.println(orders);
                    break;
                case 4:
                    System.out.println("Выход из системы...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод! Введите число от 1 до 4.");
            }
        }
    }
}
