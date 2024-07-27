package structural_design_pattern.Facade_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private final Map<String, Product> products = new HashMap();

    public ProductCatalog() {
        this.products.put("1001", new Product("1001", "Maggii", 10.0));
        this.products.put("1002", new Product("1002", "Santoor soap", 20.0));
        this.products.put("1003", new Product("1003", "Pasta", 30.0));
    }

    public Product getProduct(String productId) {
        return (Product)this.products.get(productId);
    }
}
