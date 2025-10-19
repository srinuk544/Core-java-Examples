                class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class ok {
    public static void main(String[] args) {
        Account acc = new Account(500);
        acc.withdraw(700);
        System.out.println("Balance: " + acc.getBalance());
    }
}
