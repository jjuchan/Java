package basic.access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }

    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("출금액은 0보다 크고, 잔액보다 작아야 합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }


}
