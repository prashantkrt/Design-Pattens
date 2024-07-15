package behavioral_design_pattern.StrategyPattern.example;

public class RegularCustomer implements CustomerType{
    @Override
    public void interestRate() {
        System.out.println("Interest Rate is 8.2%");
    }
}
