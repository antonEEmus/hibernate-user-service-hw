package mate.academy.exception;

public class RegistrationException extends Exception {
    public RegistrationException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public RegistrationException(String message) {
        super(message);
    }
}