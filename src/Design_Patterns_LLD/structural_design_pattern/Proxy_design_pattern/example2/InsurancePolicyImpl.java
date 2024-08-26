package Design_Patterns_LLD.structural_design_pattern.Proxy_design_pattern.example2;

public class InsurancePolicyImpl implements InsurancePolicy {

    private String name;
    private String description;
    private double price;

    public InsurancePolicyImpl(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        loadingPolicyDetails(); // simulating loading policy details from db
    }
    
    //when class object created automatically data is being loaded from a database
    private void loadingPolicyDetails() {
        //simulating loading policy details from a database
        System.out.println("Loading data from database");
        try {
            Thread.sleep(1000); // simulate slow data loading
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Policy detail is loaded!!!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPremium() {
        return price;
    }
}
