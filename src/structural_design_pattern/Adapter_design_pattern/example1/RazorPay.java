package structural_design_pattern.Adapter_design_pattern.example1;

interface RazorPay{
    void setTypeOfPayment(String Paymenttype);
    String getTypeOfPayment();

    void provideDetails(String data);
    String getDetails();
}