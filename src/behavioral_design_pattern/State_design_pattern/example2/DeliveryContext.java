package behavioral_design_pattern.State_design_pattern.example2;

class DeliveryContext {

    private OrderState currentState;
    private String orderName;

    public DeliveryContext(OrderState currentState, String orderName)
    {
        super();
        this.currentState = currentState;
        this.orderName = orderName;

        if(currentState == null) {
            this.currentState = OrderConfirmed.instance();
        }
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void update() {
        currentState.updateState(this);
    }
}
