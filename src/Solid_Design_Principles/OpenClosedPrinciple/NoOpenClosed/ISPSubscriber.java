package Solid_Design_Principles.OpenClosedPrinciple.NoOpenClosed;

public class ISPSubscriber {
    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;
    //additional property
    private Long freeUsage;

    public double calculateBill() {
        return 0.0;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public Long getFreeUsage() {
        return freeUsage;
    }

    public void setFreeUsage(Long freeUsage) {
        this.freeUsage = freeUsage;
    }
}
