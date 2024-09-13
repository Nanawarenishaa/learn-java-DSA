// Final class to represent an immutable Customer
final class Customer {
    private final String name;
    private final String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    // Getters for immutable fields
    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}

// Class to represent a Bank Account
class BankAccount {
    private final Customer customer;  // Final reference to an immutable Customer
    private double balance;

    // Final constant values
    private static final double MINIMUM_BALANCE = 500.0;
    private static final double INTEREST_RATE = 0.05;

    public BankAccount(Customer customer, double balance) {
        this.customer = customer;
        if (balance < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("Initial balance must be at least " + MINIMUM_BALANCE);
        }
        this.balance = balance;
    }

    // Final method to ensure the balance check cannot be overridden
    public final void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Final method to calculate interest which cannot be overridden
    public final void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Interest earned: " + interest);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Minimum balance must be maintained.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }
}

public class FinalKeywordEx {
    public static void main(String[] args) {
        // Creating an immutable customer
        Customer customer1 = new Customer("Alice", "C12345");
        
        // Creating a bank account for the customer
        BankAccount account1 = new BankAccount(customer1, 2400.0);

        // Checking balance and calculating interest
        account1.checkBalance();
        account1.calculateInterest();

        // Depositing money
        account1.deposit(500.0);

        
        account1.withdraw(700.0);

        
        account1.withdraw(1000.0);

    
        account1.checkBalance();
    }
}
