public class TestCustomer {
    public static void main(String[] args) {
        // Create a new Customer with ID 1, name "Alice", and a 10% discount
        Customer customer1 = new Customer(1, "Alice", 10);

        // Test getters and toString
        System.out.println("=== Customer 1 Initial State ===");
        System.out.println("ID: " + customer1.getID());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Discount: " + customer1.getDiscount());
        System.out.println("toString(): " + customer1.toString());

        // Update discount using setDiscount
        customer1.setDiscount(15);
        System.out.println("\n=== Customer 1 After Updating Discount ===");
        System.out.println("Updated Discount: " + customer1.getDiscount());
        System.out.println("toString(): " + customer1.toString());

        // Create another Customer to further test functionality
        Customer customer2 = new Customer(2, "Bob", 20);
        System.out.println("\n=== Customer 2 ===");
        System.out.println("ID: " + customer2.getID());
        System.out.println("Name: " + customer2.getName());
        System.out.println("Discount: " + customer2.getDiscount());
        System.out.println("toString(): " + customer2.toString());
    }
}
