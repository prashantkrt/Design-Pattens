package behavioral_design_pattern.Observer_design_pattern.example1;

public class ObserverPatternExample {
    public static void main(String[] args) {

        Customer Prashant=new Customer("Karthik");
        Customer Ronit=new Customer("Babu");
        Customer Karan=new Customer("Rajesh");
        Customer Rana=new Customer("Harish");
        Customer Arun=new Customer("Arnab");
        Customer Harsh=new Customer("Rashid");
        Customer SaiRaj=new Customer("SaiRaj");

        InsuranceCompany LIC= new InsuranceCompany("LIC");
        InsuranceCompany TATA= new InsuranceCompany("TATA AIA");

        LIC.addSubscriber(Prashant);
        LIC.addSubscriber(Ronit);
        LIC.addSubscriber(Karan);
        LIC.addSubscriber(Arun);
        LIC.addSubscriber(SaiRaj);
        TATA.addSubscriber(Harsh);
        TATA.addSubscriber(Rana);

        LIC.broadCastMessage("Hi EVeryone-> New Policy called Jeevan Anand is introduced");
        TATA.broadCastMessage("Hey TATA Website is not available from 12 AM to 1 AM. please plan to pay your premium accordingly");

    }
}
