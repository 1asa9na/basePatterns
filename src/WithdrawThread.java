public class WithdrawThread extends Thread {
    private BankAccount account;
    private int n;

    public WithdrawThread(BankAccount account, int n) {
        this.account = account;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            account.withdraw(i);
        }
    }
}
