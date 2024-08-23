package structural_design_pattern.Bridge_design_pattern;

public class OnlinePayment implements Payment{
    PaymentGateway paymentGateway=null;

    @Override
    public void makePayment(double amount) {
        // TODO Auto-generated method stub
        paymentGateway.processPayment(amount);
    }

    @Override
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        // TODO Auto-generated method stub
        this.paymentGateway=paymentGateway;
    }

}
