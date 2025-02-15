package Unit3.ExceptionHandling.Lesson11CustomExceptions.Task2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        try{
            String password = sc.nextLine();
            user.setPassword(password);
            System.out.println(user.getPassword());
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
