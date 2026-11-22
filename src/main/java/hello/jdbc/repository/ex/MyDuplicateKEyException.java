package hello.jdbc.repository.ex;

public class MyDuplicateKEyException extends MyDbException {
    public MyDuplicateKEyException() {
    }

    public MyDuplicateKEyException(String message) {
        super(message);
    }

    public MyDuplicateKEyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicateKEyException(Throwable cause) {
        super(cause);
    }
}
