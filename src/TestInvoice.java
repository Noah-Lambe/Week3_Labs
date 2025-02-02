public class TestInvoice {
    public static void main(String[] args) {
        // Create a customer with a 10% discount
        Customer customer1 = new Customer(1, "Alice", 10);

        // Create an invoice using the customer
        Invoice invoice1 = new Invoice(101, customer1, 200.0);

        // Test basic getters
        System.out.println("=== Basic Getters ===");
        System.out.println("Invoice ID: " + invoice1.getID());
        System.out.println("Customer: " + invoice1.getCustomer());
        System.out.println("Amount: " + invoice1.getAmount());
        System.out.println("Customer Name: " + invoice1.getCustomerName());
        System.out.println("Amount After Discount: " + invoice1.getAmountAfterDiscount());

        // Test setter for amount
        System.out.println("\n=== Testing setAmount() ===");
        invoice1.setAmount(300.0);
        System.out.println("Updated Amount: " + invoice1.getAmount());
        System.out.println("Updated Amount After Discount: " + invoice1.getAmountAfterDiscount());

        // Test setter for customer
        System.out.println("\n=== Testing setCustomer() ===");
        // Create a new customer with a different discount
        Customer customer2 = new Customer(2, "Bob", 20);
        invoice1.setCustomer(customer2);
        System.out.println("Updated Customer: " + invoice1.getCustomer());
        System.out.println("Updated Customer Name: " + invoice1.getCustomerName());
        System.out.println("Amount After Discount with new customer: " + invoice1.getAmountAfterDiscount());
    }
}
