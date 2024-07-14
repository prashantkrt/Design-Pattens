package structural_design_pattern.Adapter_design_pattern.example1;

public class PaymentAdapterForPaytm {
    static Paytm paytm = null;

    PaymentAdapterForPaytm(Paytm paytm) {
        PaymentAdapterForPaytm.paytm = paytm;
    }

    static Paytm ConvertBillDeskToPaytm(BillDesk b) {
        return PaymentAdapter.ConvertBillDeskToPaytm(b, paytm);
    }
}
