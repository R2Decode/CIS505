// ProductDB class
public class ProductDB {
    // Public static method to get products
    public static GenericQueue<Product> getProducts(String code) {
        // Create a new generic queue to store products
        GenericQueue<Product> products = new GenericQueue<>();

        // Check the code and create products accordingly
        if (code.equals("b")) {
            // Create and add ball instances to the queue
            for (int i = 0; i < 5; i++) {
                Ball ball = new Ball();
                // Set properties for ball object
                // e.g., ball.setCode("B001");
                // ball.setDescription("Bowling Ball");
                // ball.setPrice(100.00);
                // ball.setColor("Red");
                products.enqueue(ball);
            }
        } else if (code.equals("s")) {
            // Create and add shoe instances to the queue
            for (int i = 0; i < 5; i++) {
                Shoe shoe = new Shoe();
                // Set properties for shoe object
                // e.g., shoe.setCode("S001");
                // shoe.setDescription("Bowling Shoes");
                // shoe.setPrice(50.00);
                // shoe.setSize(10.0);
                products.enqueue(shoe);
            }
        } else if (code.equals("a")) {
            // Create and add bag instances to the queue
            for (int i = 0; i < 3; i++) {
                Bag bag = new Bag();
                // Set properties for bag object
                // e.g., bag.setCode("A001");
                // bag.setDescription("Bowling Bag");
                // bag.setPrice(80.00);
                // bag.setType("Double");
                products.enqueue(bag);
            }
        }

        return products;
    }
}
