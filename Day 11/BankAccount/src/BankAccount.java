 class BankAccounts {
    private String accountNumber;
    private double balance;

    
    public BankAccounts(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to 0.0");
            this.balance = 0.0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            return true;
        }
    }
}
public class BankAccount {
	    public static void main(String[] args) {
	        BankAccounts myAccount = new BankAccounts("1234567890", 5000.0);

	        System.out.println("Account Number: " + myAccount.getAccountNumber());
	        System.out.println("Balance: " + myAccount.getBalance());

	        myAccount.deposit(1000.0);
	        myAccount.withdraw(2000.0);

	        
	        System.out.println("\nAttempting to access 'balance' directly will result in a compilation error.");
	        System.out.println("This proves that encapsulation protects internal state from unauthorized access.");
	    }
}