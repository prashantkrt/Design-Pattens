package structural_design_pattern.Decorator_design_pattern;

public class AccidentalBenefit extends PolicyDecorator {

    public AccidentalBenefit(BasicPlan basicPlan) {
        super(basicPlan);
    }

    @Override
    public int getPremium() {
        return super.getPremium() + 58;
    }

    @Override
    public String policyDetails() {
        return super.policyDetails() + "Extra Accidental Benefit";
    }
}

