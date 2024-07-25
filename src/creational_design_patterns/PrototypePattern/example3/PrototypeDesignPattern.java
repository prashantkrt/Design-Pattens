package creational_design_patterns.PrototypePattern.example3;

import java.util.HashMap;
import java.util.Map;

// client class
public class PrototypeDesignPattern {

    private static Map<String, InsurancePolicy> policyCache = new HashMap<String, InsurancePolicy>();

    public static void loadCache() {
        LifeInsurancePolicy lifePolicy = new LifeInsurancePolicy("John Doe", 50000, 1000);
        policyCache.put("life", lifePolicy);
        LifeInsurancePolicy lifeInsurancePolicy = new LifeInsurancePolicy("John Smith", 70000, 3000);
        policyCache.put("life-insurance-premium", lifeInsurancePolicy);
    }

    // return the cloned object based on the LifeInsurancePolicy, shallow copy
    public static InsurancePolicy getPolicy(String policyType) {
        InsurancePolicy cachedPolicy = policyCache.get(policyType);
        try {
            return (InsurancePolicy) cachedPolicy.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        loadCache();

        InsurancePolicy lifePolicy = getPolicy("life");
        System.out.println(lifePolicy); // same
        lifePolicy.setPolicyHolder("Jane Doe");
        lifePolicy.setPolicyAmount(75000); // making changes

        System.out.println("Original Policy:");
        System.out.println("Policy Holder: " + policyCache.get("life").getPolicyHolder());
        System.out.println("Policy Amount: " + policyCache.get("life").getPolicyAmount());
        System.out.println("Premium: " + policyCache.get("life").getPremium());

        System.out.println("Cloned Policy:");
        System.out.println("Policy Holder: " + lifePolicy.getPolicyHolder());
        System.out.println("Policy Amount: " + lifePolicy.getPolicyAmount());
        System.out.println("Premium: " + lifePolicy.getPremium());

    }
}
