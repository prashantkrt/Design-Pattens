package behavioral_design_pattern.Template_design_pattern;

public class PayToMerchantFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate Merchant Flow");
    }

    @Override
    public void calculateFees() {

        System.out.println("Calculate Merchant Fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount of Merchant Flow");

    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount to Merchant Flow");

    }
}
