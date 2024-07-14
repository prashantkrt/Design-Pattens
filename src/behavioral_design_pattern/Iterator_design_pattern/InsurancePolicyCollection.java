package behavioral_design_pattern.Iterator_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsurancePolicyCollection implements Iterable<InsurancePolicy> {

    private List<InsurancePolicy> policyList;

    public InsurancePolicyCollection() {
        policyList = new ArrayList<>();
    }

    public void addPolicy(InsurancePolicy policy) {
        policyList.add(policy);
    }

    public void removePolicy(InsurancePolicy policy) {
        policyList.remove(policy);
    }


    @Override
    public Iterator<InsurancePolicy> iterator() {
        return new PolicyIterator();
    }


    // Inner class for Policy Iterator
    private class PolicyIterator implements Iterator<InsurancePolicy> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < policyList.size();
        }

        @Override
        public InsurancePolicy next() {
            if (!hasNext()) {
                return null;
            }
            return policyList.get(currentIndex++);
        }
    }
}
