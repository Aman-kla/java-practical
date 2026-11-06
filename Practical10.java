
class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful: " + amount);
        }
    }

    public void display() {
        System.out.println("\nAccount Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Current Balance: " + getBalance());
    }
}

public class Practical10 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Rahul", 123456789, 10000);

        System.out.println("===== Bank Account Details =====");
        b1.display();

        System.out.println("\n===== Deposit Transactions =====");
        b1.deposit(5000);

        b1.deposit(-1000);

        System.out.println("\n===== Withdrawal Transactions =====");
        b1.withdraw(2000);

        b1.withdraw(-500);

        b1.withdraw(50000);

        System.out.println("\n===== Updated Account Details =====");
        b1.display();
    }
}
