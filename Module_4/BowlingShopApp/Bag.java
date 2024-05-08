public class Bag extends Product {
    // Additional field for the type of bag
    private String type;

    // Constructor
    public Bag() {
        super(); // Call the superclass constructor
        this.type = "";
    }

    // Accessor method for type
    public String getType() {
        return type;
    }

    // Mutator method for type
    public void setType(String type) {
        this.type = type;
    }

    // Override toString method to include type
    @Override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }
}
