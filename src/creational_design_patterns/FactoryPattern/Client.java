package creational_design_patterns.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Notification notificationObject = factory.createNotification("email");
        notificationObject.notification();
    }
}
