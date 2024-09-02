package Solid_Design_Principles.DependecyInversionPrinciple.NonDependencyInversion;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.save("John Doe");
    }
}

/*
*
*  Tight Coupling: UserService is tightly coupled to MySQLDatabase. If you want to switch to a different database, you'll have to modify the UserService class.
*  Poor Testability: It's challenging to test UserService in isolation because it directly depends on MySQLDatabase.
* */
