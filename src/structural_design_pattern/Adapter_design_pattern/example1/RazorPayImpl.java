package structural_design_pattern.Adapter_design_pattern.example1;

public class RazorPayImpl implements RazorPay {

    private String paymentType;
    private String data;

    @Override
    public String getTypeOfPayment() {
        return paymentType;
    }

    @Override
    public void setTypeOfPayment(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public void provideDetails(String data) {
        this.data = data;
    }

    @Override
    public String getDetails() {
        return data;
    }
}
