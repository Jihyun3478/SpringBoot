package hello.jdbc.repository.ex;

public class MyDuplcateKeyException extends MyDbException {
    public MyDuplcateKeyException() {
    }

    public MyDuplcateKeyException(String message) {
        super(message);
    }

    public MyDuplcateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplcateKeyException(Throwable cause) {
        super(cause);
    }
}
