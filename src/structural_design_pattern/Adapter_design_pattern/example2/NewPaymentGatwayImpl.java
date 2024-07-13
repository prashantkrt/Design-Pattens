package structural_design_pattern.Adapter_design_pattern.example2;

class NewPaymentGatewayImpl implements NewPaymentGateway {
    public boolean authorize(String accountNumber, double amount) {
        System.out.println("Initiating payment using New payment gateway...");
        // Implementation details...
        return true;
    }
}