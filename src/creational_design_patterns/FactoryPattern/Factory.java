package creational_design_patterns.FactoryPattern;

public class Factory {

    public Notification createNotification(String notificationType) {
        Notification notification = null;
        if (notificationType.equalsIgnoreCase("EMAIL")) {
            notification = new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("SMS")) {
            notification = new SMSNotification();
        } else {
            notification = new MobileNotification();
        }
        return notification;
    }
}
