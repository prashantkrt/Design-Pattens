package structural_design_pattern.Facade_design_pattern;

public class OrderProcessor {
    OrderProcessor() {
    }

    public void processOrder(Order order, Payment payment) {
        System.out.println("Order processed successfully!");
        System.out.println("Invoice details: ");
    }
}
