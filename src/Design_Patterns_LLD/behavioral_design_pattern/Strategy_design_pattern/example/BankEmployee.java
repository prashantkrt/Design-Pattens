package Design_Patterns_LLD.behavioral_design_pattern.Strategy_design_pattern.example;

class BankEmployee implements CustomerType{
    @Override
    public void interestRate() {
        System.out.println("Interest Rate is 8.9%");
    }
}