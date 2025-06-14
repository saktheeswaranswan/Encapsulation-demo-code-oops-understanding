// File: BankAccount.java

public class BankAccount {
    // 🔒 Private attributes
    private String accountHolder;
    private double balance;

    // ✅ Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // ✅ Public method: deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ✅ Public method: withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. New balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // ✅ Public method: display account info
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }

    // ✅ Getter for balance
    public double getBalance() {
        return balance;
    }

    // ✅ Setter for balance
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // ✅ Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // ✅ Setter for account holder
    public void setAccountHolder(String name) {
        if (name != null && !name.trim().isEmpty()) {
            accountHolder = name;
        } else {
            System.out.println("Invalid name!");
        }
    }
}
