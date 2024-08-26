package Design_Patterns_LLD.structural_design_pattern.Bridge_design_pattern;


public class OfflinePayment implements Payment{

    @Override
    public void makePayment(double amount) {
    }

    @Override
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        // TODO Auto-generated method stub
    }

}