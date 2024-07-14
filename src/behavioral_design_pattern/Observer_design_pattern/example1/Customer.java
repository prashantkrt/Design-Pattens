package behavioral_design_pattern.Observer_design_pattern.example1;

public class Customer implements NotifyCustomerInterface {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void notification(String message) {
        System.out.println(name+" notification received "+message);
    }
}
