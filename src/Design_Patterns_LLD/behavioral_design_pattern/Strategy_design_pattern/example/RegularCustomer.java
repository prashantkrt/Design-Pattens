package Design_Patterns_LLD.behavioral_design_pattern.Strategy_design_pattern.example;

public class RegularCustomer implements CustomerType{
    @Override
    public void interestRate() {
        System.out.println("Interest Rate is 8.2%");
    }
}
