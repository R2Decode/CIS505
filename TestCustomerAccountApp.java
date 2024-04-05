import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for customer number
        System.out.print("Enter customer number between 1007 and 1009: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Get customer from CustomerDB
        Customer customer = CustomerDB.getCustomer(customerId);

        // Display customer details
        System.out.println(customer);

        // Create account
        Account account = new Account();

        // Display menu and handle user's selection
        int choice;
        do {
            account.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Exiting menu...");
                    break;
                default:
                    System.out.println("Error: Invalid Option.");
            }
        } while (choice != 3);

        // Display account balance
        System.out.printf("Account Balance: $%,6.2f\n", account.getBalance());

        // Close scanner
        scanner.close();
    }
}
