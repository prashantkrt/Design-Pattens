package structural_design_pattern.Adapter_design_pattern.example1;
//MyApplication is developed and using the payment with BillDesk
public class MyApplication implements BillDesk {
    String paymentType;
    String details;

    @Override
    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public void setDetails(String details) {
        this.details = details;
    }
}
