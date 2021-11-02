package exceptions;

public class StudentDoenNotHaveAnySubjectException extends Exception{
    public StudentDoenNotHaveAnySubjectException() {
    }

    public StudentDoenNotHaveAnySubjectException(String message) {
        super(message);
    }

    public StudentDoenNotHaveAnySubjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentDoenNotHaveAnySubjectException(Throwable cause) {
        super(cause);
    }
}
