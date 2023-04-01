public class BankAccount {
    private double balance;
    private String accountNumber;
    private String customerName;

    public BankAccount(String accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount: " + amount);
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount: " + amount);
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("1234567890", "John Smith");

        // Deposit some money
        account.deposit(1000.0);

        // Withdraw some money
        try {
            account.withdraw(500.0);
        } catch (IllegalStateException e) {
            System.out.println("Failed to withdraw: " + e.getMessage());
        }

        // Print the account details
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Balance: " + account.getBalance());
    }

}
