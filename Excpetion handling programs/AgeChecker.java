class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeChecker {
    public void validateAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Age cannot be negative");
        }
        if (age < 18) {
            throw new AgeException("Must be 18 or older");
        }
        System.out.println("Age " + age + " is valid");
    }

    public static void main(String[] args) {
        AgeChecker checker = new AgeChecker();
        try {
            checker.validateAge(20);
            checker.validateAge(15); 
        } catch (AgeException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}