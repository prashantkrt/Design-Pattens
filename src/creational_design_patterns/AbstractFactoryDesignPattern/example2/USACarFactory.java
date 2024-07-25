package creational_design_patterns.AbstractFactoryDesignPattern.example2;

public class USACarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN:
                car = new SEDANCar(Location.USA);
                break;

            case SUV:
                car = new SUVCar(Location.USA);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;

            default:
                break;

        }
        return car;
    }
}
