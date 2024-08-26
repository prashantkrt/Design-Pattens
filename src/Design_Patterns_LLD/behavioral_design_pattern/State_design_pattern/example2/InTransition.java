package Design_Patterns_LLD.behavioral_design_pattern.State_design_pattern.example2;

class InTransition implements OrderState
{
    //Singleton
    private static InTransition instance = new InTransition();

    private InTransition() {}

    public static InTransition instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Order is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}
