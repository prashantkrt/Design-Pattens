package structural_design_pattern.Adapter_design_pattern.example1;

public class AdapterPatternExample {
    public static void main(String[] args) {
        MyApplication application = new MyApplication();
        application.setPaymentType("UPI");
        application.setDetails("myapp@upi");
        PaymentAdapter paymentAdapter = new PaymentAdapter(new PaytmImpl());
        Paytm p = PaymentAdapter.ConvertBillDeskToPaytm(application);
        System.out.println(p.getTypeOfPayment()+" "+p.getPaymentDetail());


    }
}
