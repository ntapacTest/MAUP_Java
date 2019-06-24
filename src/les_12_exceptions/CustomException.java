package les_12_exceptions;

public class CustomException extends Exception{
    @Override
    public String getMessage() {
        return "Custom divide by zero. Index is "+index;
    }
    private int index;

    public CustomException(int index) {
        this.index = index;
    }
}
