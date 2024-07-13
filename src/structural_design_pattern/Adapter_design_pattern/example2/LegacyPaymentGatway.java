package structural_design_pattern.Adapter_design_pattern.example2;

interface LegacyPaymentGateway {
    public boolean processPayment(String creditCardNumber, double amount);
}