package structural_design_pattern.Adapter_design_pattern.example1;

interface RazorPay{
    void setTypeOfPayment(String paymentType);
    String getTypeOfPayment();

    void provideDetails(String data);
    String getDetails();
}