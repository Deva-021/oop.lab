class Account {

String accountHolder;

double balance;

double loanAmount;



public Account(String accountHolder, double balance) {

this.accountHolder = accountHolder;

this.balance = balance;

this.loanAmount = 0;

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

loanAmount += amount;

System.out.println("Loan of " + amount + " applied. Total loan amount: " + loanAmount);

}



public void applyLoan(double amount, double interestRate) {

loanAmount += amount;

double interest = amount * interestRate;

System.out.println("Loan of " + amount + " applied with interest. Total loan amount: " + loanAmount + " with interest: " + interest);

}



public void repayLoan(double amount) {

if (amount <= loanAmount) {

loanAmount -= amount;

System.out.println("Repayed loan of " + amount + ". Remaining loan amount: " + loanAmount);

} else {

System.out.println("Repayment exceeds loan amount.");

}

}



public void repayLoan(double amount, double additionalPayment) {

if (amount + additionalPayment <= loanAmount) {

loanAmount -= (amount + additionalPayment);

System.out.println("Repayed loan of " + amount + " with additional payment of " + additionalPayment + ". Remaining loan amount: " + loanAmount);

} else {

System.out.println("Repayment exceeds loan amount.");

}

}



public void calculateInterest() {

System.out.println("Interest calculated on current balance: " + (balance * 0.03));

}



public void calculateInterest(double rate) {

System.out.println("Interest calculated on current balance at rate " + rate + ": " + (balance * rate));

}



public void calculateInterest(double rate, boolean isLoan) {

if (isLoan) {

System.out.println("Interest calculated on loan amount at rate " + rate + ": " + (loanAmount * rate));

} else {

System.out.println("Invalid operation for balance interest calculation.");

}

}



public void displayAccountDetails() {

System.out.println("Account Holder: " + accountHolder);

System.out.println("Balance: " + balance);

System.out.println("Loan Amount: " + loanAmount);

}

}



public class MethodOverloading {

public static void main(String[] args) {

Account account = new Account("John Doe", 5000);



account.deposit(1000);

account.withdraw(200);



account.applyLoan(3000);

account.applyLoan(2000, 0.05);



account.repayLoan(1000);

account.repayLoan(500, 200);



account.calculateInterest();

account.calculateInterest(0.05);



account.calculateInterest(0.04, true);


account.displayAccountDetails();

}

} 