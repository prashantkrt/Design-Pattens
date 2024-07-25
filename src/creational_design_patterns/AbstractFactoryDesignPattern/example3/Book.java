package creational_design_patterns.AbstractFactoryDesignPattern.example3;

public class Book implements Product{
    @Override
    public void info() {
        System.out.println("This is a book!!");
    }
}
