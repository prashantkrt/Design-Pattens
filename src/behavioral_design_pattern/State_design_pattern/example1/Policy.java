package behavioral_design_pattern.State_design_pattern.example1;

public class Policy {
    private PolicyStatus policyStatus;

    public Policy(PolicyStatus policyStatus) {
        this.policyStatus=policyStatus;
    }

    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    public void expire() {
        policyStatus.expirePolicy(this);
    }
    public void cancel() {
        policyStatus.cancelPolicy(this);
    }
    public void renew() {
        policyStatus.renewPolicy(this);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyStatus=" + policyStatus +
                '}';
    }
}
