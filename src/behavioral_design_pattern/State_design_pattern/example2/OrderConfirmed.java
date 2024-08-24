package behavioral_design_pattern.State_design_pattern.example2;

class OrderConfirmed implements OrderState
{
    //Singleton
    private static OrderConfirmed instance = new OrderConfirmed();

    private OrderConfirmed() {}

    public static OrderConfirmed instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Order is Confirmed !!");
        ctx.setCurrentState(Shipped.instance());
    }
}