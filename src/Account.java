public class Account {
    private int id;
    private Customer2 customer;
    private double balance = 0.0;

    public Account(int id, Customer2 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer2 customer) {
        this(id, customer, 0.0);
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account[id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return this;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public Account withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return this;
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be positive and less than or equal to the account balance.");
        }
    }
}
