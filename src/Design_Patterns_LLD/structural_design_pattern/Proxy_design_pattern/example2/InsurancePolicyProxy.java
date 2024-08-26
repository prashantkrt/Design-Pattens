package Design_Patterns_LLD.structural_design_pattern.Proxy_design_pattern.example2;

// proxy class
public class InsurancePolicyProxy implements InsurancePolicy {

    private String name;
    private String description;
    private double amount;
    private InsurancePolicy realInsurancePolicy;

    public InsurancePolicyProxy(String name, String description, double amount) {
        this.name = name;
        this.description = description;
        this.amount = amount;
    }

    @Override
    public String getName() {
        if(realInsurancePolicy == null) {
            loadRealPolicy();
        }
        return realInsurancePolicy.getName();
    }

    @Override
    public String getDescription() {
        if(realInsurancePolicy == null) {
            loadRealPolicy();
        }
        return realInsurancePolicy.getDescription();
    }

    @Override
    public double getPremium() {
        if(realInsurancePolicy == null) {
            loadRealPolicy();
        }
        return realInsurancePolicy.getPremium();
    }

    private void loadRealPolicy() {
        System.out.println("Loading policy details from the insurance ");
        realInsurancePolicy = new InsurancePolicyImpl(name, description, amount);
    }
}
