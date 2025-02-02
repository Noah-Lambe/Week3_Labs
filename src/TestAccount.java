public class TestAccount {
    public static void main(String[] args) {
        // Create a Customer2 instance for testing
        Customer2 customer = new Customer2(101, "John Doe", 'M' );

        // Test Account constructors
        System.out.println("=== Testing Constructors ===");
        Account account1 = new Account(1, customer, 500.0);
        System.out.println("Account 1: " + account1);

        Account account2 = new Account(2, customer); // balance should default to 0.0
        System.out.println("Account 2: " + account2);

        // Test deposit method with valid amount
        System.out.println("\n=== Testing Deposit ===");
        account1.deposit(250.0);
        System.out.println("After depositing 250.0, Account 1: " + account1);

        // Test withdraw method with valid amount
        System.out.println("\n=== Testing Withdraw ===");
        account1.withdraw(100.0);
        System.out.println("After withdrawing 100.0, Account 1: " + account1);

        // Test deposit method with invalid (negative) amount
        System.out.println("\n=== Testing Invalid Deposit ===");
        try {
            account1.deposit(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception on deposit: " + e.getMessage());
        }

        // Test withdraw method with invalid amount (greater than balance)
        System.out.println("\n=== Testing Invalid Withdraw ===");
        try {
            account2.withdraw(50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception on withdraw: " + e.getMessage());
        }

        // Test setBalance method
        System.out.println("\n=== Testing setBalance ===");
        account2.setBalance(300.0);
        System.out.println("Account 2 after setting balance to 300.0: " + account2);
    }
}
