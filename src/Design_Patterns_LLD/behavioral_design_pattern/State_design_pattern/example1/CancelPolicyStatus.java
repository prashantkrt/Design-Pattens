package Design_Patterns_LLD.behavioral_design_pattern.State_design_pattern.example1;

public class CancelPolicyStatus implements PolicyStatus{

    @Override
    public void expirePolicy(Policy policy) {
        System.out.println("Policy status is changed to Expired");
    }

    @Override
    public void cancelPolicy(Policy policy) {
        System.out.println("Policy status is changed to Cancel");
    }

    @Override
    public void renewPolicy(Policy policy) {
        policy.setPolicyStatus(new ActivePolicyStatus());
    }

    @Override
    public String toString() {
        return "CancelPolicyStatus";
    }

}
