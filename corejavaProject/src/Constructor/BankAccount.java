package Constructor;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount() {
        this("Unknown");
    }

    BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    BankAccount(String accountHolder, long accountNumber) {
        this(accountHolder, accountNumber, 0.0);
    }

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        BankAccount b2 = new BankAccount("Krishna");

        BankAccount b3 = new BankAccount("Krishna", 1234567890L);

        BankAccount b4 = new BankAccount("Krishna", 1234567890L, 50000.0);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}