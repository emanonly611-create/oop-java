// lab task 2
class Account{
    double balance;
    Account() {
        balance = 0;
    }
    Account(double initialBalance, double amount) {
        balance = initialBalance + amount;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
    void showBalance() {
        System.out.println("Balance = " + balance);
    }
}
public class bal{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(5000);
        a1.withdraw(1000);
        a1.showBalance();
        Account a2 = new Account(5000, 2000);
        a2.showBalance();
    }
}

