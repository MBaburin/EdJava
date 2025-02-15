package Unit3.ExceptionHandling.Lesson11CustomExceptions.Task1;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);
        try{
            double amount = sc.nextDouble();
            bankAccount.setBalance(amount);
            System.out.println(bankAccount.getBalance());
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
