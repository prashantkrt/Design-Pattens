package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class Mobile implements Product {
    @Override
    public void info() {
        System.out.println("Mobile phone");
    }

    @Override
    public void price() {
        System.out.println("Mobile phone price is 10000");
    }
}
