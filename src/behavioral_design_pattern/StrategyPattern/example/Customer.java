package behavioral_design_pattern.StrategyPattern.example;

public class Customer {

    private CustomerType customerType;

    public Customer(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void showInterestRate() {
        customerType.interestRate();
    }
}
