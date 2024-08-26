package Design_Patterns_LLD.structural_design_pattern.Proxy_design_pattern;

//Real subject
public class InsuranceCompany implements Policy{
    private String policyHolderName;
    private String policyType;
    private int coverageAmount;
    private int deductible;
    private String insuranceCompany;

    public InsuranceCompany(String policyHolderName, String policyType, int coverageAmount, int deductible, String insuranceCompany) {
        this.policyHolderName = policyHolderName;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
        this.deductible = deductible;
        this.insuranceCompany = insuranceCompany;
    }

    @Override
    public void getPolicyDetails() {
        System.out.println("Policy details for " + policyHolderName + ":");
        System.out.println("Policy type: " + policyType);
        System.out.println("Coverage amount: " + coverageAmount);
        System.out.println("Deductible: " + deductible);
        System.out.println("Insurance company: " + insuranceCompany);
    }
}
