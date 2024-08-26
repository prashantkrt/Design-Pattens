package Design_Patterns_LLD.structural_design_pattern.Bridge_design_pattern;

public class BillDeskPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("process payment of BillDeskPaymentGateway -processed amount "+amount);
    }

    @Override
    public void refundAmount(double amount) {
        // TODO Auto-generated method stub
    }

}