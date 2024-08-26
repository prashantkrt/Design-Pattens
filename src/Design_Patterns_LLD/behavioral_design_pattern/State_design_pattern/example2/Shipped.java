package Design_Patterns_LLD.behavioral_design_pattern.State_design_pattern.example2;

class Shipped implements OrderState
{
    //Singleton
    private static Shipped instance = new Shipped();

    private Shipped() {}

    public static Shipped instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Order is shipped !!");
        ctx.setCurrentState(InTransition.instance());
    }
}

