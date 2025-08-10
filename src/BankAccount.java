public class BankAccount {
    private static BankAccount account; 
    private int balance = 10_000_000;

    public static synchronized BankAccount getBankAccount() {
        if (account == null) {
            account = new BankAccount();
        }
        return account;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        balance -= amount;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
