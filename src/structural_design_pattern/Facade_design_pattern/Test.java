package structural_design_pattern.Facade_design_pattern;

public class Test {
    public static void main(String[] args) {
        EcommerceFacade ecommerce = new EcommerceSystemFacade();

        // Add items to cart
        ecommerce.addToCart("1001", 2);
        ecommerce.addToCart("1002", 1);

        // Remove item from cart
        ecommerce.removeItemFromCart("1001");

        // Checkout
        ecommerce.checkout("Credit Card");
    }
}
