class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    String[] transactionHistory;  
    int transactionCount;    

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new String[10]; 
        this.transactionCount = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposited " + amount + ". New balance: " + balance);
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            recordTransaction("Withdrew " + amount + ". New balance: " + balance);
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            toAccount.balance += amount;
            recordTransaction("Transferred " + amount + " to " + toAccount.accountHolder + ". New balance: " + balance);
            toAccount.recordTransaction("Received " + amount + " from " + accountHolder + ". New balance: " + toAccount.balance);
            System.out.println(amount + " transferred to " + toAccount.accountHolder + ". Your new balance: " + balance);
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount.");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for " + accountHolder + ":");
        if (transactionCount == 0) {
            System.out.println("No transactions recorded.");
        } else {
            for (int i = 0; i < transactionCount; i++) {
                System.out.println((i + 1) + ". " + transactionHistory[i]);
            }
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    private void recordTransaction(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount] = transaction;
            transactionCount++;
        } else {
            System.out.println("Transaction history is full.");
        }
    }
}

public class BankAppWithTransaction {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ACC123", "Soorya", 5000.00);
        BankAccount account2 = new BankAccount("ACC456", "Ajith", 3000.00);

        account1.deposit(1000);

        account2.withdraw(500);

        account1.transfer(account2, 1500);

        account1.displayTransactionHistory();
        account2.displayTransactionHistory();

        account1.checkBalance();
        account2.checkBalance();
    }
}
