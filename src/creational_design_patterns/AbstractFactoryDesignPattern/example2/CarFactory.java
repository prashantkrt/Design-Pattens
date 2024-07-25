package creational_design_patterns.AbstractFactoryDesignPattern.example2;

//Utility Factory class
public class CarFactory {

    private CarFactory() {
     //Since it's utility class, I don't want its object to be created
    }

    public static Car buildCar(CarType type, String purchaseLocation) {

        Car car = null;
        Location location = null;

        if (purchaseLocation.equalsIgnoreCase("USA"))
            location = Location.USA;
        else if (purchaseLocation.equalsIgnoreCase("INDIA"))
            location = Location.INDIA;
        else
            location = Location.DEFAULT;


        switch (location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;

            case INDIA:
                car = INDIACarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
