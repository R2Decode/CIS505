// Import the Product class
import java.util.*;

// Ball class extending Product superclass
public class Ball extends Product {
    // Additional field for the color of the ball
    private String color;

    // Constructor
    public Ball() {
        super(); // Call the superclass constructor
        this.color = "";
    }

    // Accessor method for color
    public String getColor() {
        return color;
    }

    // Mutator method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Override toString method to include color
    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }
}
