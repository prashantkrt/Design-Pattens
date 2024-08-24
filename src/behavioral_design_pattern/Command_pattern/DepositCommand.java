package behavioral_design_pattern.Command_pattern;

public class DepositCommand implements Command{

    Account a=null;
    double amount=0;

    DepositCommand(Account a,double amount){
        this.a=a;
        this.amount=amount;
    }

    @Override
    public void execute() {
        a.deposit(amount);
    }
}

