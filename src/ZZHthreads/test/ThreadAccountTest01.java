package ZZHthreads.test;

import ZZHthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    private void withdrawal(int amount) {
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " is going to withdrawal money");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " finished withdrawing, current balance " + account.getBalance());
            } else {
                System.out.println("Not enought balance for " + getThreadName() + " withdrawal money");
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Something VERY VERY WRONG happened");
            }
        }
    }
}
