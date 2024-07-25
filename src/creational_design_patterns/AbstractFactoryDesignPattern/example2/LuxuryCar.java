package creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class LuxuryCar extends Car {

    LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to luxury car");
    }
}
