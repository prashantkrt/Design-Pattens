package Design_Patterns_LLD.creational_design_patterns.AbstractFactoryDesignPattern.example3;

public class BookFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Book();
    }
}
