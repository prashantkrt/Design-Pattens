package behavioral_design_pattern.StrategyPattern.example;

class BankEmployee implements CustomerType{
    @Override
    public void interestRate() {
        System.out.println("Interest Rate is 8.9%");
    }
}