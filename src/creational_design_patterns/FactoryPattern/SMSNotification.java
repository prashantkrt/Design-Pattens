package creational_design_patterns.FactoryPattern;

public class SMSNotification implements Notification {

    @Override
    public void notification() {
        System.out.println("Triggering Notification from SMS");
    }
}
