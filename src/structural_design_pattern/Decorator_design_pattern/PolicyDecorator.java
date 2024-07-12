package structural_design_pattern.Decorator_design_pattern;

abstract class PolicyDecorator implements BasicPlan{

    BasicPlan basicPlan;

    PolicyDecorator(BasicPlan basicPlan) {
        this.basicPlan = basicPlan;
    }

    @Override
    public int getPremium() {
        return basicPlan.getPremium();
    }

    @Override
    public String policyDetails() {
        return basicPlan.policyDetails();
    }
}
