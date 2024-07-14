package structural_design_pattern.Adapter_design_pattern.example1;

public class PaytmImpl implements Paytm {

    private String paymentType;
    private String details;


    @Override
    public void setTypeOfPayment(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String getTypeOfPayment() {
        return paymentType;
    }

    @Override
    public String getPaymentDetail() {
        return details;
    }

    @Override
    public void setPaymentDetail(String details) {
        this.details = details;
    }
}
