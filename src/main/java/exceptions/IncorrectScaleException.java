package exceptions;

public class IncorrectScaleException extends Exception{
    public IncorrectScaleException() {
    }

    public IncorrectScaleException(String message) {
        super(message);
    }

    public IncorrectScaleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectScaleException(Throwable cause) {
        super(cause);
    }
}
