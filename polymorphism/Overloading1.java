class Account {
    String accountHolder;
    double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void applyLoan(double amount) {
        System.out.println("Loan of " + amount + " applied.");
    }

    public void repayLoan(double amount) {
        System.out.println("Repayed loan of " + amount + ".");
    }

    public void calculateInterest() {
        System.out.println("Interest calculated.");
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest(double rate) {
        double interest = balance * rate;
        System.out.println("Interest earned: " + interest);
    }
}

class LoanAccount extends Account {
    double loanAmount;

    public LoanAccount(String accountHolder, double balance, double loanAmount) {
        super(accountHolder, balance);
        this.loanAmount = loanAmount;
    }

    public void applyLoan(double amount) {
        loanAmount += amount;
        System.out.println("Loan of " + amount + " applied. Total loan amount: " + loanAmount);
    }

    public void repayLoan(double amount) {
        if (amount <= loanAmount) {
            loanAmount -= amount;
            System.out.println("Repayed loan of " + amount + ". Remaining loan amount: " + loanAmount);
        } else {
            System.out.println("Repayment exceeds loan amount.");
        }
    }
}

class HybridAccount extends SavingsAccount {
    LoanAccount loanAccount;

    public HybridAccount(String accountHolder, double balance, double interestRate, double loanAmount) {
        super(accountHolder, balance, interestRate);
        loanAccount = new LoanAccount(accountHolder, balance, loanAmount);
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Loan Amount: " + loanAccount.loanAmount);
        calculateInterest(interestRate);
    }

    public void applyLoan(double amount) {
        loanAccount.applyLoan(amount);
    }

    public void repayLoan(double amount) {
        loanAccount.repayLoan(amount);
    }
}

public class Overloading1 {
    public static void main(String[] args) {
        HybridAccount account = new HybridAccount("John Doe", 5000, 0.03, 1000);

        account.deposit(1000);
        account.withdraw(200);
        account.applyLoan(5000);
        account.repayLoan(2000);
        account.displayAccountDetails();
    }
}
