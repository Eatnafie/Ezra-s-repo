
class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Customer(Customer customer) {
        this.name = customer.name;
        this.age = customer.age;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Age: " + age;
    }

    // Getters and Setters
}
