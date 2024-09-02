package Solid_Design_Principles.DependecyInversionPrinciple.DependencyInversion;

public class UserService {

    private DataBase database;

    // Constructor injection
    public UserService(DataBase database) {
        this.database = database;
    }

    public void save(String user) {
        database.saveUser(user);
    }
}
