package Solid_Design_Principles.DependecyInversionPrinciple.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        // Dependency injection
        DataBase mysqlDatabase = new MySQLDatabase();
        UserService userService = new UserService(mysqlDatabase);

        userService.save("John Doe");
    }
}


//Loose Coupling: UserService now depends on the Database abstraction, not on the concrete MySQLDatabase implementation. You can easily switch to another database implementation (e.g., PostgreSQLDatabase) without modifying UserService.
//Improved Testability: You can now easily mock the Database interface when testing UserService, making unit tests more straightforward.
