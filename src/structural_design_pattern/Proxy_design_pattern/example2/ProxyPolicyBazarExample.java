package structural_design_pattern.Proxy_design_pattern.example2;

public class ProxyPolicyBazarExample {
    public static void main(String[] args) {
        InsurancePolicy insurancePolicy = new InsurancePolicyProxy("Term Life Insurance","Provides the life coverage",6000);

        // customer requests policy details
        System.out.println("Policy Name: " + insurancePolicy.getName());
        System.out.println("Policy Description: " + insurancePolicy.getDescription());
        System.out.println("Policy Premium "+insurancePolicy.getPremium());
    }
}
