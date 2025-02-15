package Unit3.ExceptionHandling.Lesson11CustomExceptions.Task2;


public class User {
    private String password;

    public void setPassword(String password) throws WeakPasswordException {
        if (password.length() < 8 || !password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Ошибка: пароль слишком слабый! Минимальная длина — 8 символов и хотя бы одна цифра.");
        }
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
