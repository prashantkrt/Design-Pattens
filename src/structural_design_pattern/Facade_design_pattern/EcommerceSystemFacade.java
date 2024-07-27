package structural_design_pattern.Facade_design_pattern;

public class EcommerceSystemFacade implements EcommerceFacade{
    private final ProductCatalog catalog = new ProductCatalog();
    private final ShoppingCart cart = new ShoppingCart();
    private final OrderProcessor processor = new OrderProcessor();

    public EcommerceSystemFacade() {
    }

    public void addToCart(String productId, int quantity) {
        Product product = this.catalog.getProduct(productId);
        this.cart.addItem(product, quantity);
    }

    public void removeItemFromCart(String productId) {
        Product product = this.catalog.getProduct(productId);
        this.cart.removeItem(product);
    }

    public void checkout(String paymentMethod) {
        Order order = new Order(this.cart.getItems());
        Payment payment = PaymentFactory.createPayment(paymentMethod);
        this.processor.processOrder(order, payment);
    }
}
