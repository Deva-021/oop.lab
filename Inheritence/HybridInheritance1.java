class Bank {
    protected String bankName;
    protected String location;

    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    public void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Bank Location: " + location);
    }
}

class Account extends Bank {
    protected double balance;

    public Account(String bankName, String location, double balance) {
        super(bankName, location);
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String bankName, String location, double balance, double interestRate) {
        super(bankName, location, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
        calculateInterest();
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String bankName, String location, double balance, double overdraftLimit) {
        super(bankName, location, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit exceeds overdraft limit!");
        }
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class HybridInheritance1{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("ABC Bank", "New York", 1000, 5);
        savingsAccount.displayBankInfo();
        savingsAccount.deposit(500);
        savingsAccount.checkBalance();
        savingsAccount.withdraw(300);
        savingsAccount.checkBalance();

        System.out.println("\n--- Current Account ---");
        CurrentAccount currentAccount = new CurrentAccount("XYZ Bank", "Los Angeles", 2000, 500);
        currentAccount.displayBankInfo();
        currentAccount.deposit(600);
        currentAccount.checkBalance();
        currentAccount.withdraw(1000);
        currentAccount.checkBalance();
    }
}
