// Custom Exception Class
class IllegalArgumentExceptionExample extends Exception {
    public IllegalArgumentExceptionExample(String message) {
        super(message);
    }
}

public class ThrowExample {
    public static void validateAge(int age) throws IllegalArgumentExceptionExample {
        if (age < 18) {
            throw new IllegalArgumentExceptionExample("Age must be 18 or above.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) throws IllegalArgumentExceptionExample {
        validateAge(16); // Throws exception
        System.out.println("This line will not execute.");
    }
}
