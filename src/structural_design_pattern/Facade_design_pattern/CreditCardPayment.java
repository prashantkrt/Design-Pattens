package structural_design_pattern.Facade_design_pattern;

public class CreditCardPayment implements Payment {

    CreditCardPayment() {
    }

    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed using credit card");
    }
}
