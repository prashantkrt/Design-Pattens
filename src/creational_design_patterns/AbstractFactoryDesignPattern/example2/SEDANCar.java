package creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class SEDANCar extends Car {

    SEDANCar(Location location) {
        super(CarType.SEDAN, location);

    }

    @Override
    protected void construct() {
        System.out.println("Connecting to SEDAN Car ");

    }
}
