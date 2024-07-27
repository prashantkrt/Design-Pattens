package structural_design_pattern.Facade_design_pattern;

public class PayPalPayment implements Payment{
    PayPalPayment() {
    }

    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed using PayPal");
    }
}
