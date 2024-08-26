package Design_Patterns_LLD.creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class AbstractDesignExample {
    public static void main(String[] args) {
         CarFactory.buildCar(CarType.SEDAN,"USA").construct();
         CarFactory.buildCar(CarType.SUV,"INDIA").construct();
    }
}
