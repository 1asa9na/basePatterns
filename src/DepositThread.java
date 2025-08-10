public class DepositThread extends Thread {
    private BankAccount account;
    private int n;

    public DepositThread(BankAccount account, int n) {
        this.account = account;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            account.deposit(i);
        }
    }
}
