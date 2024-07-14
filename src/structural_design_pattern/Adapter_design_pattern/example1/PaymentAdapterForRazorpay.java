package structural_design_pattern.Adapter_design_pattern.example1;

public class PaymentAdapterForRazorpay {
    static RazorPay razorPay = null;

    PaymentAdapterForRazorpay(RazorPay razorPay) {
        PaymentAdapterForRazorpay.razorPay = razorPay;
    }

    static RazorPay ConvertBillDeskToRazorPay(BillDesk b) {
        return PaymentAdapter.ConvertBillDeskToRazorPay(b, razorPay);
    }
}
