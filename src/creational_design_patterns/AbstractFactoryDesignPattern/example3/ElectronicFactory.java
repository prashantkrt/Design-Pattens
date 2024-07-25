package creational_design_patterns.AbstractFactoryDesignPattern.example3;

public class ElectronicFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Electronic();
    }
}
