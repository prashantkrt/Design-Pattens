package behavioral_design_pattern.Observer_design_pattern.example1;

public interface ManageSubscribersAndNotify {

    public void addSubscriber(NotifyCustomerInterface r);

    public void removeSubscriber(NotifyCustomerInterface r);

    public void notifyAllSubscribers(String message);
}
