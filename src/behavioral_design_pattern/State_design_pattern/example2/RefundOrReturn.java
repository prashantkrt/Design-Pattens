package behavioral_design_pattern.State_design_pattern.example2;

class RefundOrReturn implements OrderState {

    private static RefundOrReturn instance = new RefundOrReturn();

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println(" Status is Refunded or Returned");

    }
    public static RefundOrReturn instance() {
        return instance;
    }

}