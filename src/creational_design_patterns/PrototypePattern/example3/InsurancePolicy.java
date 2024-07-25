package creational_design_patterns.PrototypePattern.example3;

public interface InsurancePolicy extends Cloneable{
    public String getPolicyHolder();

    public void setPolicyHolder(String policyHolder);

    public double getPolicyAmount();

    public void setPolicyAmount(double policyAmount);

    public double getPremium();

    public void setPremium(double premium);

    public InsurancePolicy clone() throws CloneNotSupportedException;
}
