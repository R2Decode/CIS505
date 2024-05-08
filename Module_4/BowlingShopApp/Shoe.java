// Shoe class extending Product superclass
public class Shoe extends Product {
    // Additional field for the shoe size
    private double size;

    // Constructor
    public Shoe() {
        super(); // Call the superclass constructor
        this.size = 0;
    }

    // Accessor method for size
    public double getSize() {
        return size;
    }

    // Mutator method for size
    public void setSize(double size) {
        this.size = size;
    }

    // Override toString method to include size
    @Override
    public String toString() {
        return super.toString() + "\nSize: " + size;
    }
}
