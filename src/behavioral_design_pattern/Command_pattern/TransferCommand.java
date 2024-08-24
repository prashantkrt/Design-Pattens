package behavioral_design_pattern.Command_pattern;

public class TransferCommand implements Command{

    Account fromAccount=null;
    Account toAccount=null;
    double amount=0;

    TransferCommand(Account fromAccount,Account toAccount,double amount){
        this.fromAccount=fromAccount;
        this.toAccount=toAccount;
        this.amount=amount;
    }

    @Override
    public void execute() {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println(" Amount "+amount+" is transferred from "+fromAccount+" to "+toAccount);
    }
}

