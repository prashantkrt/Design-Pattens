package structural_design_pattern.Adapter_design_pattern.example1;

public class AdapterPatternExample {
    public static void main(String[] args) {

        MyApplication application = new MyApplication();
        application.setPaymentType("UPI");
        application.setDetails("myapp@upi");

        Paytm p = PaymentAdapter.ConvertBillDeskToPaytm(application,new PaytmImpl());
        System.out.println(p.getTypeOfPayment()+" "+p.getPaymentDetail());


        RazorPay p2 = PaymentAdapter.ConvertBillDeskToRazorPay(application, new RazorPayImpl());
        System.out.println(p2.getTypeOfPayment()+" "+p2.getDetails());
    }
}