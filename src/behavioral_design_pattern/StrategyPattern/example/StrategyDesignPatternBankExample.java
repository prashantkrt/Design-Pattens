package behavioral_design_pattern.StrategyPattern.example;

public class StrategyDesignPatternBankExample {
    public static void main(String[] args) {
        Customer c1= new Customer(new PreferredCustomer());
        c1.showInterestRate();

        Customer c2= new Customer(new RegularCustomer());
        c2.showInterestRate();

        Customer c3= new Customer(new BankEmployee());
        c3.showInterestRate();
    }
}
