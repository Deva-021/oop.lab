// Interface for deposit and withdraw operations
interface DepositWithdrawable {
    void deposit(double amount);
    void withdraw(double amount);
}

// Interface for loan-related operations
interface Loanable {
    void applyLoan(double amount);
    void repayLoan(double amount);
}

// Interface for interest-related operations
interface InterestCalculable {
    void calculateInterest();
}

// Account class implementing DepositWithdrawable
class Account implements DepositWithdrawable {
    String accountHolder;
    double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// SavingsAccount implements InterestCalculable
class SavingsAccount extends Account implements InterestCalculable {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest earned: " + interest);
    }
}

// LoanAccount implements Loanable
class LoanAccount extends Account implements Loanable {
    double loanAmount;

    public LoanAccount(String accountHolder, double balance, double loanAmount) {
        super(accountHolder, balance);
        this.loanAmount = loanAmount;
    }

    @Override
    public void applyLoan(double amount) {
        loanAmount += amount;
        System.out.println("Loan of " + amount + " applied. Total loan amount: " + loanAmount);
    }

    @Override
    public void repayLoan(double amount) {
        if (amount <= loanAmount) {
            loanAmount -= amount;
            System.out.println("Repayed loan of " + amount + ". Remaining loan amount: " + loanAmount);
        } else {
            System.out.println("Repayment exceeds loan amount.");
        }
    }
}

// HybridAccount implements all interfaces
class HybridAccount extends SavingsAccount implements Loanable {
    LoanAccount loanAccount;

    public HybridAccount(String accountHolder, double balance, double interestRate, double loanAmount) {
        super(accountHolder, balance, interestRate);
        loanAccount = new LoanAccount(accountHolder, balance, loanAmount);
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Loan Amount: " + loanAccount.loanAmount);
        calculateInterest();
    }

    @Override
    public void applyLoan(double amount) {
        loanAccount.applyLoan(amount);
    }

    @Override
    public void repayLoan(double amount) {
        loanAccount.repayLoan(amount);
    }
}

// Main class
public class HybridInheritance1 {
    public static void main(String[] args) {
        HybridAccount account = new HybridAccount("John Doe", 5000, 0.03, 1000);

        account.deposit(1000);
        account.withdraw(200);
        account.applyLoan(5000);
        account.repayLoan(2000);
        account.displayAccountDetails();
    }
}
