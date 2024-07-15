package behavioral_design_pattern.StrategyPattern.example;

public class PreferredCustomer implements CustomerType{

    @Override
    public void interestRate() {
        System.out.println("Interest rate is 9.7%");
    }
}
