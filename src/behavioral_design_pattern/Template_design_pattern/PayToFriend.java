package behavioral_design_pattern.Template_design_pattern;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Validate logic for PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate fees for PayToFriend");

    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount for PayToFriend");

    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount for PayToFriend");
    }
}
