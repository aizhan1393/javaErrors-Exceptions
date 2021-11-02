package exceptions;

public class NoGroupsOnFacultyException extends Exception{
    public NoGroupsOnFacultyException() {
    }

    public NoGroupsOnFacultyException(String message) {
        super(message);
    }

    public NoGroupsOnFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoGroupsOnFacultyException(Throwable cause) {
        super(cause);
    }
}
