package Unit3.ExceptionHandling.Lesson11CustomExceptions.Task1;

public class BankAccount {
    private double balance;

    public void setBalance(double balance) throws NegativeBalanceException {
        if (balance < 0) {
            throw new NegativeBalanceException("Ошибка: баланс не может быть отрицательным!");
        }
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
