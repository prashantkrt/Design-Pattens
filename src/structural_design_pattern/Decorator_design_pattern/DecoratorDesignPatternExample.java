package structural_design_pattern.Decorator_design_pattern;

public class DecoratorDesignPatternExample {  

    public static void main(String[] args) {
        
        BasicPlan KarthikPolicy = new BasePolicy();
        System.out.println(KarthikPolicy.getPremium());
        System.out.println(KarthikPolicy.policyDetails());

        // he wanted to add-on but this shouldn't make changes to Karthik's object
        // we can use a decorator design pattern to solve this
        BasicPlan AjayPolicy = new BasePolicy();
        AjayPolicy = new AccidentalBenefit(AjayPolicy);
        System.out.println(AjayPolicy.getPremium());
        System.out.println(AjayPolicy.policyDetails());

        AjayPolicy = new CriticalIllnessBenefit(AjayPolicy);
        System.out.println(AjayPolicy.getPremium());
        System.out.println(AjayPolicy.policyDetails());



    }
}
