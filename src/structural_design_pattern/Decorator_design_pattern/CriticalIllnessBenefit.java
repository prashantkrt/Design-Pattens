package structural_design_pattern.Decorator_design_pattern;

public class CriticalIllnessBenefit extends PolicyDecorator{

    public CriticalIllnessBenefit(BasicPlan basicPlan) {
        super(basicPlan);
    }

    @Override
    public int getPremium() {
        return super.getPremium()+ 650;
    }

    @Override
    public String policyDetails() {
        return super.policyDetails() + " Critical Illness Benefit";
    }
}
