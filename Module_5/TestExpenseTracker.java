package Module_5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Module_5.Transaction;
import Module_5.TransactionIO;
import Module_5.ValidatorIO;

public class TestExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. View all transactions");
            System.out.println("2. Add a new transaction");
            System.out.println("3. Display total expenses");
            System.out.println("4. Exit");
            int choice = ValidatorIO.getInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    viewAllTransactions();
                    break;
                case 2:
                    addNewTransaction(scanner);
                    break;
                case 3:
                    displayTotalExpenses();
                    break;
                case 4:
                    continueProgram = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void viewAllTransactions() {
        try {
            ArrayList<Transaction> transactions = TransactionIO.findAll();
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        } catch (IOException e) {
            System.out.println("Error reading transactions from file: " + e.getMessage());
        }
    }

    private static void addNewTransaction(Scanner scanner) {
        ArrayList<Transaction> transactions = new ArrayList<>();
        boolean addAnother = true;

        while (addAnother) {
            String date = ValidatorIO.getString(scanner, "Enter transaction date (MM-dd-yyyy): ");
            String description = ValidatorIO.getString(scanner, "Enter transaction description: ");
            double amount = ValidatorIO.getDouble(scanner, "Enter transaction amount: ");
            transactions.add(new Transaction(date, description, amount));

            String continueInput = ValidatorIO.getString(scanner, "Add another transaction? (yes/no): ");
            addAnother = continueInput.equalsIgnoreCase("yes");
        }

        try {
            TransactionIO.bulkInsert(transactions);
            System.out.println("Transactions added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing transactions to file: " + e.getMessage());
        }
    }

    private static void displayTotalExpenses() {
        try {
            ArrayList<Transaction> transactions = TransactionIO.findAll();
            double totalExpenses = 0.0;
            for (Transaction transaction : transactions) {
                totalExpenses += transaction.getAmount();
            }
            System.out.println("Total expenses: $" + String.format("%.2f", totalExpenses));
        } catch (IOException e) {
            System.out.println("Error reading transactions from file: " + e.getMessage());
        }
    }
}
