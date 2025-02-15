package Unit3.ExceptionHandling.Lesson11CustomExceptions.Task2;

public class WeakPasswordException extends Exception {
    public WeakPasswordException(String message ) {
        super(message);
    }
}
