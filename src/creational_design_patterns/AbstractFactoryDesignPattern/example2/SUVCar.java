package creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class SUVCar extends Car {

    SUVCar(Location location) {
        super(CarType.SUV, location);

    }

    @Override
    void construct() {
        System.out.println("Connecting to SUV car");
    }
}
