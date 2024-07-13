package structural_design_pattern.Adapter_design_pattern.example1;

// Now we have created an adapter which will be processing the payment with Paytm new way
// without changing the actual implementation of MyApplication

public class PaymentAdapter {

    static Paytm p = null;
    static RazorPay r = null;

    PaymentAdapter(Paytm p) {
        PaymentAdapter.p = p;
    }

    static Paytm ConvertBillDeskToPaytm(BillDesk b) {
        p.setTypeOfPayment(b.getPaymentType());
        p.setPaymentDetail(b.getDetails());
        return p;
    }

    static RazorPay ConvertBillDeskToRazoPay(BillDesk b) {

        r.setTypeOfPayment(b.getPaymentType());
        r.provideDetails(b.getDetails());
        return r;
    }
}
