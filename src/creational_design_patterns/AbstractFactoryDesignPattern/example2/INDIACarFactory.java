package creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class INDIACarFactory {
    static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN:
                car = new SEDANCar(Location.INDIA);
                break;

            case SUV:
                car = new SUVCar(Location.INDIA);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;

            default:
                break;

        }
        return car;
    }
}
