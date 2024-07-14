package structural_design_pattern.Adapter_design_pattern.example1;

public interface Paytm {
    void setTypeOfPayment(String paymentType);

    String getTypeOfPayment();

    String getPaymentDetail();

    void setPaymentDetail(String details);
}
