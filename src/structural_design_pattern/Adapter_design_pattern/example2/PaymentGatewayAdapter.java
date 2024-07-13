package structural_design_pattern.Adapter_design_pattern.example2;

public class PaymentGatewayAdapter implements LegacyPaymentGateway {

    private NewPaymentGateway newPaymentGateway;

    PaymentGatewayAdapter(NewPaymentGateway newPaymentGateway) {
        this.newPaymentGateway = newPaymentGateway;
    }

    @Override
    public boolean processPayment(String creditCardNumber, double amount) {
        boolean authorized = newPaymentGateway.authorize(creditCardNumber, amount);
        if (authorized) {
            System.out.println("Payment authorized and processed by the new payment gateway");
            return true;
        } else {
            System.out.println("Payment authorization failed");
            return false;
        }
    }
}
