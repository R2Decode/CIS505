package Module_5;
import java.util.Date;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    // Default constructor
    public Transaction() {
        this.date = formatDate(new Date());
        this.description = "";
        this.amount = 0.0;
    }

    // Parameterized constructor
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    // Accessor methods
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    // Mutator methods
    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Date: " + date + "\nDescription: " + description + "\nAmount: $" + String.format("%.2f", amount);
    }

    // Utility method to format date
    private String formatDate(Date date) {
        // Implement your date formatting logic here
        return ""; // Placeholder for formatting logic
    }
}
