package Solid_Design_Principles.DependecyInversionPrinciple.NonDependencyInversion;

// Low-level module
public class MySQLDatabase {
    public void saveUser(String user) {
        System.out.println("Saving " + user + " to MySQL Database");
    }
}
