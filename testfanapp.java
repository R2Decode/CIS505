// TestFanApp.java
public class TestFanApp {
    public static void main(String[] args) {
        // Create fan1 using the default constructor
        Fan fan1 = new Fan();
        
        // Create fan2 using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "yellow");
        
        // Display the fans
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
