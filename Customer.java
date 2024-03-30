public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    // No-argument constructor
    public Customer() {
        this.name = "";
        this.address = "";
        this.city = "";
        this.zip = "";
    }

    // Argument constructor
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nCity: " + city + "\nZip: " + zip;
    }
}
