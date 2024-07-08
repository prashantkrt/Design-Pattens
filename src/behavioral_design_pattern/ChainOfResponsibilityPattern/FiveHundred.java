package behavioral_design_pattern.ChainOfResponsibilityPattern;

public class FiveHundred implements DispenseChain {

    DispenseChain dispenseChainNext;

    @Override
    public void dispense(Currency currency) {
        int noOf500Notes = (int) (currency.getAmount() / 500);
        System.out.println("Dispensing no. of 500 notes " + noOf500Notes);
        int remainder = (int) (currency.getAmount() % 500);
        if (remainder != 0) {
            //going to 100
            this.dispenseChainNext.dispense(new Currency(remainder));
        }
    }

    @Override
    public void chain(DispenseChain dispenseChainObj) {
        //100 objecr
        this.dispenseChainNext = dispenseChainObj;
    }


}
