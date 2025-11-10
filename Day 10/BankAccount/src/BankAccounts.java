 class BankAccount {
    // 1. Private Instance Variables
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // 2. Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be non-negative.");
            this.balance = 0;
        }
    }

    // 3. Public Getter Methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // 4. Public Operation Methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("1234567890", "Alice Johnson", 5000.0);

        // Display account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Perform a deposit
        account.deposit(1500.0);

        // Attempt an invalid deposit
        account.deposit(-200.0);

        // Perform a withdrawal
        account.withdraw(1000.0);

        // Attempt an invalid withdrawal
        account.withdraw(-300.0);

        // Attempt to withdraw more than the balance
        account.withdraw(10000.0);
    }
}

