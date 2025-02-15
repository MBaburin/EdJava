package Unit3.ExceptionHandling.Lesson11CustomExceptions.Task1;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
