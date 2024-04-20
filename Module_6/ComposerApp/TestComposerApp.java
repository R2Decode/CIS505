package Module_6.ComposerApp;

import java.util.Scanner;

public class TestComposerApp {
    public static void main(String[] args) {
        MemComposerDao dao = new MemComposerDao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Composer App\n");
        int choice = 0;

        do {
            System.out.println("Menu Options");
            System.out.println("1. View Composers");
            System.out.println("2. Find Composer");
            System.out.println("3. Add Composer");
            System.out.println("4. Exit\n");
            System.out.print("Please Choose an Option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n--Displaying Composers--");
                    for (Composer composer : dao.findAll()) {
                        System.out.println(composer);
                    }
                    break;
                case 2:
                    System.out.print("\nEnter an id: ");
                    int id = scanner.nextInt();
                    Composer foundComposer = dao.findBy(id);
                    if (foundComposer != null) {
                        System.out.println("\n--Displaying Composer--");
                        System.out.println(foundComposer);
                    } else {
                        System.out.println("\nComposer not found.");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter an id: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter a name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter a genre: ");
                    String newGenre = scanner.nextLine();
                    dao.insert(new Composer(newId, newName, newGenre));
                    System.out.println("\nNew composer added successfully.");
                    break;
                case 4:
                    System.out.println("\nExiting Composer App.");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please choose again.");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}

