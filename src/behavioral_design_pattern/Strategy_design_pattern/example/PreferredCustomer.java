package behavioral_design_pattern.Strategy_design_pattern.example;

public class PreferredCustomer implements CustomerType{

    @Override
    public void interestRate() {
        System.out.println("Interest rate is 9.7%");
    }
}
