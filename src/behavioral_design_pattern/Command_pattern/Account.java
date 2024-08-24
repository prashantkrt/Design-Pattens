package behavioral_design_pattern.Command_pattern;

public class Account {
    public double balance;

    void withdraw(double amount) {
        if (balance < 0) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - amount;
        }
        System.out.println(" Balance amount is " + balance + " after withdrawal " + amount);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(" Balance amount is " + balance + " after deposit " + amount);
    }
}
