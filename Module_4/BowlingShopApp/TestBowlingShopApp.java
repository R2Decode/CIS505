import java.util.Scanner;

// TestBowlingShopApp class
public class TestBowlingShopApp {
    // Scanner object for user input
    private static Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        displayMenu();
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Get Bowling Balls (Enter 'b')");
        System.out.println("2. Get Bowling Shoes (Enter 's')");
        System.out.println("3. Get Bowling Bags (Enter 'a')");
        System.out.println("4. Exit (Enter 'x')");
        System.out.println("Enter your choice:");

        // Read user input
        String choice = scanner.nextLine();

        // Handle user choice
        switch (choice.toLowerCase()) {
            case "b":
                // Invoke ProductDB method to get bowling balls
                GenericQueue<Product> balls = ProductDB.getProducts("b");
                displayProducts(balls);
                break;
            case "s":
                // Invoke ProductDB method to get bowling shoes
                GenericQueue<Product> shoes = ProductDB.getProducts("s");
                displayProducts(shoes);
                break;
            case "a":
                // Invoke ProductDB method to get bowling bags
                GenericQueue<Product> bags = ProductDB.getProducts("a");
                displayProducts(bags);
                break;
            case "x":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMenu(); // Show menu again
                break;
        }
    }

    // Method to display products
    public static void displayProducts(GenericQueue<Product> products) {
        while (!products.isEmpty()) {
            System.out.println(products.dequeue());
        }
    }
}
