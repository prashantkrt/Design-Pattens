package Solid_Design_Principles.DependecyInversionPrinciple.NonDependencyInversion;

// High-level module
public class UserService {
    private MySQLDatabase database = new MySQLDatabase();

    public void save(String user) {
        database.saveUser(user);
    }
}
