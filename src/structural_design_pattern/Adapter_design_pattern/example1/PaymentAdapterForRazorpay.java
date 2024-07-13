package structural_design_pattern.Adapter_design_pattern.example1;

public class PaymentAdapterForRazorpay {
    static Paytm p = null;

    PaymentAdapterForRazorpay(Paytm p) {
        this.p = p;
    }

    static Paytm ConvertBillDeskToPaytm(BillDesk b) {
        p.setTypeOfPayment(b.getPaymentType());
        p.setPaymentDetail(b.getDetails());
        return p;
    }
}
