package structural_design_pattern.Bridge_design_pattern;

public class Main {

    public static void main(String[] args) {

        Payment app= new OnlinePayment();
        app.setPaymentGateway(new PayPalGateway());
        app.makePayment(100);

        app.setPaymentGateway(new BillDeskPaymentGateway());
        app.makePayment(100);
    }
}
