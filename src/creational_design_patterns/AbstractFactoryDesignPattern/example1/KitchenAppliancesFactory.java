package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class KitchenAppliancesFactory implements ProductFamily{
    Product p;
    KitchenAppliancesFactory(Product p){
        this.p=p;
    }

    @Override
    public Product createProduct() {
        return p;
    }
}
