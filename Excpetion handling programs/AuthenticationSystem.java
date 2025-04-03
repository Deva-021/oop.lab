class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException() {
        super("Invalid username or password");
    }
}

class AccountLockedException extends Exception {
    public AccountLockedException(int minutesRemaining) {
        super("Account locked. Try again in " + minutesRemaining + " minutes");
    }
}

class BruteForceAttemptException extends Exception {
    public BruteForceAttemptException(String ip) {
        super("Suspicious login attempts from " + ip + ". Account temporarily locked");
    }
}

public class AuthenticationSystem {
    private int failedAttempts = 0;
    private boolean isLocked = false;
    
    public void login(String username, String password, String ipAddress) 
            throws InvalidCredentialsException, AccountLockedException, BruteForceAttemptException {
        
        if (isLocked) {
            throw new AccountLockedException(30);
        }
        
        if (failedAttempts >= 3) {
            isLocked = true;
            throw new BruteForceAttemptException(ipAddress);
        }
        
                boolean isValid = "admin".equals(username) && "secure123".equals(password);
        
        if (!isValid) {
            failedAttempts++;
            throw new InvalidCredentialsException();
        }
        
        
        failedAttempts = 0;
        System.out.println("Login successful for user: " + username);
    }
    
    public static void main(String[] args) {
        AuthenticationSystem auth = new AuthenticationSystem();
        try {
            auth.login("wrong", "credentials", "192.168.1.1");
        } catch (InvalidCredentialsException | AccountLockedException | BruteForceAttemptException e) {
            System.err.println("Authentication error: " + e.getMessage());
                    }
    }
}