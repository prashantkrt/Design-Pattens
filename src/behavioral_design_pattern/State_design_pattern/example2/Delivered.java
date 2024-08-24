package behavioral_design_pattern.State_design_pattern.example2;

class Delivered implements OrderState
{
    //Singleton
    private static Delivered instance= new Delivered();

    public Delivered() {

    }
    public static Delivered instance() {
        return instance;
    }

    //Business logic
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Order is delivered!!");
        //if the product is damaged
        ctx.setCurrentState(RefundOrReturn.instance());
    }
}
