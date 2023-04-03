package lr2;

interface Accauntable {
    void makeTransactrion(int value);

    int getBalance();
}

class Account implements Accauntable {
    public Account(int balance) {
        this.balance_ = balance;
    }

    @Override
    public void makeTransactrion(int value) {
        balance_ -= value;
    }

    @Override
    public int getBalance() {
        return balance_;
    }

    private int balance_ = 0;
}

public class Task7 {
    public static void main(String[] args) {
        Accauntable account = new Account(1000);
        System.out.println("Баланс: " + account.getBalance());
        account.makeTransactrion(500);
        System.out.println("Баланс: " + account.getBalance());
    }
}
