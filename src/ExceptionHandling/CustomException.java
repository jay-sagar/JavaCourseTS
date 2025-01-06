package ExceptionHandling;

public class CustomException extends RuntimeException{
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}
