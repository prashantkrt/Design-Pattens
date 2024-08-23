package structural_design_pattern.Bridge_design_pattern;

// BillDesk or Paypal
public interface PaymentGateway {
    void processPayment(double amount);
    void refundAmount(double amount);
}
