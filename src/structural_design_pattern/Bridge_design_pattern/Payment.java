package structural_design_pattern.Bridge_design_pattern;

// online or offline
public interface Payment {
    void makePayment(double amount);
    void setPaymentGateway(PaymentGateway paymentGateway);
}
