//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccount = new BankAccount("123456789", "Sokcheat",   1000.0);
        // Performing transactions
        myAccount.deposit(500.0);
        myAccount.checkBalance();
        myAccount.withdraw(200.0);
        myAccount.checkBalance();
        // Updating account holder information
        myAccount.setAccountHolder("Jessica");
        // Displaying updated account information
        System.out.println("Updated Acc:"+ myAccount.getAccountHolder());
    }
}