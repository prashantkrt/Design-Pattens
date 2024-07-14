package structural_design_pattern.Adapter_design_pattern.example1;

// Now we have created an adapter which will be processing the payment with Paytm new way
// without changing the actual implementation of MyApplication

// common adapter from BillDesk to PayTm or RazorPay
public class PaymentAdapter {

    static Paytm p = null;
    static RazorPay r = null;


    static Paytm ConvertBillDeskToPaytm(BillDesk b, Paytm p) {
        p.setTypeOfPayment(b.getPaymentType());
        p.setPaymentDetail(b.getDetails());
        return p;
    }

    static RazorPay ConvertBillDeskToRazorPay(BillDesk b,RazorPay r) {
        r.setTypeOfPayment(b.getPaymentType());
        r.provideDetails(b.getDetails());
        return r;
    }
}
