package behavioral_design_pattern.ChainOfResponsibilityPattern;

public class Fifty implements DispenseChain{

    DispenseChain dispenseChainNext;

    @Override
    public void dispense(Currency currency) {
        int noOf50Notes = (int) (currency.getAmount() / 50);
        System.out.println("Dispensing no. of 50 notes " + noOf50Notes);
        System.out.println(dispenseChainNext+"dghdkjghdljkfgh");
    }

    @Override
    public void chain(DispenseChain dispenseChainObj) {
        this.dispenseChainNext = dispenseChainObj;
    }
}
