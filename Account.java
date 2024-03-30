import java.util.Scanner;

public class Account {
    private double balance = 200;

    // Accessor method
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amt) {
        balance += amt;
    }

    // Withdraw method
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    // Display menu method
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
    }

    // Get transaction date method
    public String getTransactionDate() {
        // Implement your date format logic here
        return "MM-dd-yyyy";
    }
}
