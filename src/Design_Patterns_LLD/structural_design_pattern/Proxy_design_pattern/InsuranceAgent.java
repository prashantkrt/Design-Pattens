package Design_Patterns_LLD.structural_design_pattern.Proxy_design_pattern;

//Proxy class
public class InsuranceAgent implements Policy {
    private Policy insuranceCompany;

    public InsuranceAgent(String policyHolderName, String policyType, int coverageAmount, int deductible, String insuranceCompany) {
        this.insuranceCompany = new InsuranceCompany(policyHolderName, policyType, coverageAmount, deductible, insuranceCompany);
    }

    @Override
    public void getPolicyDetails() {
        System.out.println("Additional services provided by insurance agent:");
        System.out.println("- Policy recommendations");
        System.out.println("- Claims assistance");

        insuranceCompany.getPolicyDetails();
    }
}
