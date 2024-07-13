package structural_design_pattern.Adapter_design_pattern.example2;

interface NewPaymentGateway {
    public boolean authorize(String creditCardNumber, double amount);
}
