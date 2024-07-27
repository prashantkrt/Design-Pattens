package structural_design_pattern.Facade_design_pattern;

import java.time.LocalDateTime;
import java.util.Map;

public class Order {
    private final Map<Product, Integer> items;
    private final LocalDateTime orderTime;

    public Order(Map<Product, Integer> items) {
        this.items = items;
        this.orderTime = LocalDateTime.now();
    }

    public Map<Product, Integer> getItems() {
        return this.items;
    }

    public LocalDateTime getOrderTime() {
        return this.orderTime;
    }
}
