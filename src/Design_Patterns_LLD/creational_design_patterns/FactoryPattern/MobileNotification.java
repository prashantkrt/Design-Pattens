package Design_Patterns_LLD.creational_design_patterns.FactoryPattern;

public class MobileNotification implements Notification{
    @Override
    public void notification() {
        System.out.println("Triggering mobile notification");
    }
}
