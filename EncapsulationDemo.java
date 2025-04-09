class BankAccount {
    // Private variable to store balance
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance! Setting to 0.");
            this.balance = 0;
        }
    }

    // Public getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }
}

// Main class to test BankAccount
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount(1000);

        // Display initial balance
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money
        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());

        // Withdrawing money
        account.withdraw(300);
        System.out.println("Updated Balance: " + account.getBalance());

        // Trying to withdraw an invalid amount
        account.withdraw(1500);
    }
}
