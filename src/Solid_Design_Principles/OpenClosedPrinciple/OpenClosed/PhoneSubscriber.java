package Solid_Design_Principles.OpenClosedPrinciple.OpenClosed;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return (double) (totalDuration * getBaseRate()) /100;
    }
}
