package structural_design_pattern.Bridge_design_pattern;

public class OnlinePayment implements Payment{
    //has-a
    PaymentGateway paymentGateway=null;

    @Override
    public void makePayment(double amount) {
        paymentGateway.processPayment(amount);
    }

    @Override
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway=paymentGateway;
    }

}
