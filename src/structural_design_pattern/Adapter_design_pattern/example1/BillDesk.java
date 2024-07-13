package structural_design_pattern.Adapter_design_pattern.example1;
//When MyApplication is developed we thought of using BillDesk payment
public interface BillDesk {
    String getPaymentType();

    void setPaymentType(String paymentType);

    String getDetails();

    void setDetails(String details);
}
