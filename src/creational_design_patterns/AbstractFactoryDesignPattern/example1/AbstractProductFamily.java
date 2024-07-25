package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class AbstractProductFamily {
    Product getProductFamily(String category) {
        if ("Electronics".equals(category)) {
            return new ElectronicsFactory(new Mobile()).createProduct();
        }
        if ("KitchenAppliances".equals(category)) {
            return new KitchenAppliancesFactory(new DishWasher()).createProduct();
        }
        return null;
    }
}
