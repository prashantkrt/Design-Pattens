package Design_Patterns_LLD.behavioral_design_pattern.State_design_pattern.example1;

public class MainClass {
    public static void main(String[] args) {
        Policy p = new Policy(new ActivePolicyStatus());
        p.cancel();

        Policy p1 = new Policy(new CancelPolicyStatus());
        p.renew();
    }
}
