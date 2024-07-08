package behavioral_design_pattern.ChainOfResponsibilityPattern;

public class Hundred implements DispenseChain {

    DispenseChain dispenseChainNext;

    @Override
    public void dispense(Currency currency) {
        int noOf500Notes = (int) (currency.getAmount() / 100);
        System.out.println("Dispensing no. of 100 notes " + noOf500Notes);
        int remainder = (int) (currency.getAmount() % 100);
        if (remainder != 0) {
            //going to 50
            dispenseChainNext.dispense(new Currency(remainder));
        }
    }

    @Override
    public void chain(DispenseChain dispenseChainObj) {
        //50 object
        this.dispenseChainNext = dispenseChainObj;
    }

}
