package creational_design_patterns.AbstractFactoryDesignPattern.example1;

//Simple FactoryPattern
//Now if we want to further categorize the items like Kitchen and Electronics, we can go for AbstractFactory Pattern
public class ProductFactory {

    public Product getProduct(String type) {
        if ("Mobile".equalsIgnoreCase(type)) {
            return new Mobile();
        }
        if ("Television".equalsIgnoreCase(type)) {
            return new Television();
        }
        if ("Dishwasher".equalsIgnoreCase(type)) {
            return new DishWasher();
        }
        return null;
    }
}
