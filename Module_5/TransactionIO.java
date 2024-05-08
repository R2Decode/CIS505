package Module_5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        File file = new File(FILE_NAME);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true); // Append mode
            for (Transaction transaction : transactions) {
                writer.write(transaction.getDate() + "," + transaction.getDescription() + "," + transaction.getAmount() + "\n");
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        File file = new File(FILE_NAME);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String date = parts[0];
                    String description = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    transactions.add(new Transaction(date, description, amount));
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return transactions;
    }
}
