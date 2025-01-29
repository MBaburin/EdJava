//Напиши программу, которая вычисляет площадь круга, если радиус задан как число типа double.
//Выведи результат с точностью до 2-х знаков после запятой.
//Используй значение числа π как 3.14159.


package Lesson1JavaTypes;

public class Task2 {
        public static void main(String[] args) {
            int r = 2;
            double p = 3.14159;
            String formattedDouble = String.format("%.2f", p*r*r);
            System.out.println(formattedDouble);
        }
}
