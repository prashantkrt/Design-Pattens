package Solid_Design_Principles.OpenClosedPrinciple.OpenClosed;

import java.util.List;

public class ISPSubscriber extends Subscriber {

    //additional property
    private Long freeUsage;

    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(getSubscriberId());
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableAmount = totalData - freeUsage;
        return (double) (chargeableAmount * getBaseRate()) /100;
    }
}
