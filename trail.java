// Define custom exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// Use custom exception
public class Test {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
