package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class ECommerceAbstractFactory {
    public static void main(String[] args) {
        AbstractProductFamily p = new AbstractProductFamily();
        Product product = p.getProductFamily("Electronics");
        product.info();
        product.price();

        Product product2 = p.getProductFamily("KitchenAppliances");
        product2.info();
        product2.price();
    }
}
