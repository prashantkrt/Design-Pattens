package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class DishWasher implements Product {
    @Override
    public void info() {
        System.out.println("DishWasher ");
    }

    @Override
    public void price() {
        System.out.println("DishWasher  price is 31000");
    }
}
