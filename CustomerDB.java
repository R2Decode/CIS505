public class CustomerDB {
    public static Customer getCustomer(Integer id) {
        if (id == 1007) {
            return new Customer("John Doe", "123 Main St", "Anytown", "12345");
        } else if (id == 1008) {
            return new Customer("Jane Smith", "456 Oak St", "Othertown", "54321");
        } else if (id == 1009) {
            return new Customer("Bob Johnson", "789 Pine St", "Somewhere", "67890");
        } else {
            return new Customer(); // default customer
        }
    }
}


