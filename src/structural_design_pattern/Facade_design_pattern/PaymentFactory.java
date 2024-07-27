package structural_design_pattern.Facade_design_pattern;

public class PaymentFactory {
    PaymentFactory() {
    }

    public static Payment createPayment(String paymentMethod) {
        if (paymentMethod.equals("Credit Card")) {
            return new CreditCardPayment();
        } else if (paymentMethod.equals("PayPal")) {
            return new PayPalPayment();
        } else {
            throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}
