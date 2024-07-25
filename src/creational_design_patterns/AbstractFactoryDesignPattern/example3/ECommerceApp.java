package creational_design_patterns.AbstractFactoryDesignPattern.example3;

// Client code that uses the Abstract Factory to create Products
public class ECommerceApp {
    public static void main(String[] args) {
        ProductFactory bookFactory = new BookFactory();
        Product book = bookFactory.createProduct();
        book.info();

        ProductFactory electronicFactory = new ElectronicFactory();
        Product electronic = electronicFactory.createProduct();
        electronic.info();
    }
}
