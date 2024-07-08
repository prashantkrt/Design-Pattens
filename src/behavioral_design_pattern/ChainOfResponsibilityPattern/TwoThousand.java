package behavioral_design_pattern.ChainOfResponsibilityPattern;

public class TwoThousand implements DispenseChain {

    DispenseChain dispenseChainNext;

    @Override
    public void dispense(Currency currency) {
        int noOf2000Notes = (int) (currency.getAmount() / 2000);
        System.out.println("Dispensing No. of 2000 notes " + noOf2000Notes);
        int remainder = (int) (currency.getAmount() % 2000);
        if (remainder != 0) {
            //going to 500
            this.dispenseChainNext.dispense(new Currency(remainder));
        }
    }

    @Override
    public void chain(DispenseChain dispenseChainObj) {
       //500 object
       this.dispenseChainNext = dispenseChainObj;
    }
}
