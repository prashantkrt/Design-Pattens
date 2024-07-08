package behavioral_design_pattern.ChainOfResponsibilityPattern;

public class Currency {

    private double amount;

    public Currency(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
