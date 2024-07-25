package creational_design_patterns.PrototypePattern.example3;

public class LifeInsurancePolicy implements InsurancePolicy {

    private String policyHolder;
    private double policyAmount;
    private double premium;

    public LifeInsurancePolicy() {
    }

    public LifeInsurancePolicy(String policyHolder, double policyAmount, double premium) {
        this.policyHolder = policyHolder;
        this.policyAmount = policyAmount;
        this.premium = premium;
    }

    @Override
    public String getPolicyHolder() {
        return policyHolder;
    }

    @Override
    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    @Override
    public double getPolicyAmount() {
        return policyAmount;
    }

    @Override
    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    @Override
    public double getPremium() {
        return premium;
    }

    @Override
    public void setPremium(double premium) {
        this.premium = premium;
    }

    //Shallow copy
    @Override
    public InsurancePolicy clone() throws CloneNotSupportedException {
        return (InsurancePolicy) super.clone(); // returns the Object so we have to cast it
    }

    @Override
    public String toString() {
        return "LifeInsurancePolicy{" +
                "policyHolder='" + policyHolder + '\'' +
                ", policyAmount=" + policyAmount +
                ", premium=" + premium +
                '}';
    }
}
