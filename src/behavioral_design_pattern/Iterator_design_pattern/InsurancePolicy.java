package behavioral_design_pattern.Iterator_design_pattern;

class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private String policyType;
    private double policyAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, String policyType, double policyAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.policyType = policyType;
        this.policyAmount = policyAmount;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public double getPolicyAmount() {
        return policyAmount;
    }
}