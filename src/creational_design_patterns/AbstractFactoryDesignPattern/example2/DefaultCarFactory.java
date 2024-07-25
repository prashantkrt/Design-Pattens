package creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class DefaultCarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN:
                car = new SEDANCar(Location.DEFAULT);
                break;

            case SUV:
                car = new SUVCar(Location.DEFAULT);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;

            default:
                break;

        }
        return car;
    }
}
