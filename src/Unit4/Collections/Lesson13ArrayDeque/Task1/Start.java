//Программа имитирует систему задач. Пользователь может добавлять задачи в конец очереди и выполнять их по порядку (удалять с начала).
//✅ Использовать: ArrayDeque<String>, методы addLast(), pollFirst().

package Unit4.Collections.Lesson13ArrayDeque.Task1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        ArrayDeque<String> tasks = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        Description description = new Description();
        description.printDescription();

        while (true) {
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Укажите название задачи:");
                    String name = sc.nextLine();
                    tasks.addLast(name);
                    System.out.println("Задача добавлена: " + name);
                    break;
                case 2:
                    if (!tasks.isEmpty()) {
                        System.out.println("Задача " + tasks.pollFirst() + " выполнена");
                    } else {
                        System.out.println("Нет задач для выполнения!");
                    }
                    break;
                case 3:
                    if (!tasks.isEmpty()) {
                        System.out.println("Список задач: " + tasks);
                    } else {
                        System.out.println("Список задач пуст!");
                    }
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
