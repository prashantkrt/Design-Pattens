package behavioral_design_pattern.State_design_pattern.example2;

class OutForDelivery implements OrderState
{
    //Singleton
    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {}

    public static OutForDelivery instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Order is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}