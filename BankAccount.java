class Bank {
    int accountNumber;
    String accountHolderName;
    double balance;

    Bank(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Please deposit a valid amount.");
        }
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful. Withdrawn amount: " + amount);
        }
    }

    public void transfer(Bank targetAccount, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.withDraw(amount);  
            targetAccount.deposit(amount); 
            System.out.println("Transfer successful. Transferred amount: " + amount);
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount.");
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Bank person1 = new Bank(1234, "Soorya", 1000);
        Bank person2 = new Bank(1235, "Soorya2", 5000);

        System.out.println("///////////////////////////");

        person1.deposit(500);
        person1.withDraw(400);
        person1.displayInfo();

        person2.deposit(2000);
        person2.withDraw(3000);
        person2.displayInfo();

        person2.transfer(person1, 1500);
        person1.displayInfo();
        person2.displayInfo();
    }
}
