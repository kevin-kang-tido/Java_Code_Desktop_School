public class BankAccount {
    // declare data member with private access modifier
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient   funds.");
        }
    }
    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }
    // Getter method for account holder
    public String getAccountHolder() {
        return accountHolder;
    }
    // Setter method for account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }
    // Getter method for balance
    public double getBalance() {
        return balance;
    }
}

