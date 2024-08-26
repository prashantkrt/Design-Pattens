package Design_Patterns_LLD.behavioral_design_pattern.Command_pattern;

public class WithdrawCommand implements Command {

    Account a = null;
    double amount = 0;

    WithdrawCommand(Account a, double amount) {
        this.a = a;
        this.amount = amount;
    }

    @Override
    public void execute() {
        a.withdraw(amount);
    }
}
