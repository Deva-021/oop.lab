interface Logger {
    void logInfo(String message);
    void logError(String message);
}

interface Auditable {
    void audit(String event);
}

class SystemMonitor implements Logger, Auditable {

    @Override
    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("[ERROR] " + message);
    }

    @Override
    public void audit(String event) {
        System.out.println("[AUDIT] " + event);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SystemMonitor monitor = new SystemMonitor();

        monitor.logInfo("System started successfully.");
        monitor.logError("Connection to database failed.");
        monitor.audit("User login attempt.");
    }
}