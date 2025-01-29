//Напиши программу, которая принимает символ с клавиатуры и выводит его ASCII-код.

package Lesson1JavaTypes;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        System.out.println("ASCII-код символа '" + symbol + "': " + (int) symbol);
    }
}
