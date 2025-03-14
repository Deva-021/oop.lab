import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Initial balance must be greater than zero.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }

    
    public void deposit(double amount) {
        super.deposit(amount);
    }
}

public class Singleinheritance2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial balance: $");
        double initialBalance = input.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        double interestRate = input.nextDouble();

        SavingsAccount account = new SavingsAccount(initialBalance, interestRate);

        System.out.println("Banking operations:\n");

        System.out.print("Enter deposit amount: $");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: $");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);

        account.calculateInterest();

        System.out.println("\nFinal balance after interest: $" + account.getBalance());

        input.close();
    }
}
