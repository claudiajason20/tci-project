public class CourseDateException extends Exception{
    public CourseDateException() {
    }

    public CourseDateException(String message) {
        super(message);
    }

    public CourseDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CourseDateException(Throwable cause) {
        super(cause);
    }

    public CourseDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
