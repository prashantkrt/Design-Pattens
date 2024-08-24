package behavioral_design_pattern.State_design_pattern.example1;

public class ActivePolicyStatus implements PolicyStatus{

    @Override
    public void expirePolicy(Policy policy) {
        System.out.println(" current policy status is "+this.toString());
        policy.setPolicyStatus(new ExpiredPolicyState());
        System.out.println(" current policy status is changed to "+this.toString());
    }

    @Override
    public void cancelPolicy(Policy policy) {
        System.out.println(" current policy status is "+this.toString());
        policy.setPolicyStatus(new CancelPolicyStatus());
        System.out.println(" current policy status is "+policy.getPolicyStatus());
    }

    @Override
    public void renewPolicy(Policy policy) {
        System.out.println(" current policy status is "+this.toString());
        policy.setPolicyStatus(new ActivePolicyStatus());
        System.out.println(" current policy status is "+this.toString());
    }

    @Override
    public String toString() {
        return "ActivePolicyStatus";
    }
}
