package Solid_Design_Principles.SingleResponsibilityPrinciple.SingleResponsibilty;

public class UserPersistenceService {

    private final Store store = new Store();

    public void saveUser(User user) {
        store.addUser(user);
    }
}
