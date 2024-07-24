package behavioral_design_pattern.Template_design_pattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void creditAmount();


    public final void sendMoney() {
        validateRequest();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}
