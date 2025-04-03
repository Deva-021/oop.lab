class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

public class UserRegistration {
    public void registerUser(String username, String password) throws UserException {
        if (username == null || username.length() < 4) {
            throw new UserException("Username must be at least 4 characters");
        }
        if (password == null || password.length() < 6) {
            throw new UserException("Password must be at least 6 characters");
        }
        System.out.println("User '" + username + "' registered successfully");
    }
    
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser("admin", "123456");
            registration.registerUser("bob", "123"); // This will throw exception
        } catch (UserException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}