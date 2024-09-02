package Solid_Design_Principles.DependecyInversionPrinciple.DependencyInversion;

// Low-level module
public class MySQLDatabase implements DataBase{
    @Override
    public void saveUser(String user) {
        System.out.println("Saving " + user + " to MySQL Database");
    }
}
