package behavioral_design_pattern.Observer_design_pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany implements ManageSubscribersAndNotify {

    String insuranceCompanyName;

    List<NotifyCustomerInterface> subscriberList = new ArrayList<>();

    InsuranceCompany(String name) {
        this.insuranceCompanyName = name;
    }

    @Override
    public void addSubscriber(NotifyCustomerInterface r) {
        subscriberList.add(r);
    }

    @Override
    public void removeSubscriber(NotifyCustomerInterface r) {
        subscriberList.remove(r);
    }

    @Override
    public void notifyAllSubscribers(String message) {
        subscriberList.forEach(i -> i.notification(message));
    }

    public void broadCastMessage(String message) {
        notifyAllSubscribers(message);
    }
}
