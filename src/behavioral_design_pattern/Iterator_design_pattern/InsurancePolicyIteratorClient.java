package behavioral_design_pattern.Iterator_design_pattern;

import java.util.Iterator;

public class InsurancePolicyIteratorClient {
    public static void main(String[] args) {
        InsurancePolicyCollection policyCollection = new InsurancePolicyCollection();
        policyCollection.addPolicy(new InsurancePolicy("1001", "John Smith", "Life", 100000));
        policyCollection.addPolicy(new InsurancePolicy("1002", "Mary Jones", "Health", 5000));
        policyCollection.addPolicy(new InsurancePolicy("1003", "David Lee", "Auto", 20000));

        Iterator<InsurancePolicy> policyIterator = policyCollection.iterator();
        while (policyIterator.hasNext()) {
            InsurancePolicy policy = policyIterator.next();
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Policy Holder: " + policy.getPolicyHolderName());
            System.out.println("Policy Type: " + policy.getPolicyType());
            System.out.println("Policy Amount: " + policy.getPolicyAmount());
            //concurrently, we can update as per our own iterator impl
            if(policy.getPolicyType().equals("Health")) {
                policyCollection.removePolicy(policy);
            }
        }
    }
}
