package creational_design_patterns.AbstractFactoryDesignPattern.example1;

public class Television implements Product{
    @Override
    public void info() {
        System.out.println("Television ");
    }

    @Override
    public void price() {
        System.out.println("Television phone price is 20000");
    }
}
