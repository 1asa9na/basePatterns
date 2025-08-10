public class App {
    public static void main(String[] args) throws Exception {
        BankAccount acc = BankAccount.getBankAccount();
        Thread depositThread = new DepositThread(acc, 10000);
        Thread withdrawThread = new WithdrawThread(acc, 10000);
        depositThread.start();
        withdrawThread.start();
        depositThread.join();
        withdrawThread.join();
        System.out.println(acc.getBalance());

        acc.withdraw(1000);
        BankAccount acc2 = BankAccount.getBankAccount();
        System.out.println(acc2.getBalance());
    }
}
