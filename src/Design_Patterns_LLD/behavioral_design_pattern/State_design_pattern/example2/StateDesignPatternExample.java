package Design_Patterns_LLD.behavioral_design_pattern.State_design_pattern.example2;

public class StateDesignPatternExample {
    public static void main(String[] args) {

        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
