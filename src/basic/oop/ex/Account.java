package basic.oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
         balance += amount;
    }

    void withdraw(int amount) {
         if (balance >= amount) {
             balance -= amount;
         } else {
             System.out.println("잔고부족");
         }
    }
}
