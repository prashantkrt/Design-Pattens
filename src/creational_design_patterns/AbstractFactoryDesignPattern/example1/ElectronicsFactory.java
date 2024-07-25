package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class ElectronicsFactory implements ProductFamily{
    Product p;
    ElectronicsFactory(Product p){
        this.p=p;
    }

    @Override
    public Product createProduct() {
        return p;
    }
}
