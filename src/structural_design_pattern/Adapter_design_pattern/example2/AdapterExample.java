package structural_design_pattern.Adapter_design_pattern.example2;

public class AdapterExample {

    public static void main(String[] args) {
        NewPaymentGateway newPaymentGateway = new NewPaymentGatewayImpl();

        //Create an adapter for the legacy payment gateway
        LegacyPaymentGateway legacyPaymentGateway = new PaymentGatewayAdapter(newPaymentGateway);

        //Use the legacy payment gateway interface to process payments
        boolean paymentProcessed = legacyPaymentGateway.processPayment("1234-5678-9012-3456", 100.0);

    }
}
