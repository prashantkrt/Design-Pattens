package structural_design_pattern.Facade_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<Product, Integer> items = new HashMap();

    public ShoppingCart() {
    }

    public void addItem(Product product, int quantity) {
        int currentQuantity = (Integer)this.items.getOrDefault(product, 0);
        this.items.put(product, currentQuantity + quantity);
    }

    public void removeItem(Product product) {
        this.items.remove(product);
    }

    public Map<Product, Integer> getItems() {
        return this.items;
    }
}
