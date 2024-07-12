package structural_design_pattern.Decorator_design_pattern;

public class BasePolicy implements BasicPlan {

    @Override
    public int getPremium() {
        return 1566;
    }

    @Override
    public String policyDetails() {
        return "This is a BasePolicy covers";
    }
}
