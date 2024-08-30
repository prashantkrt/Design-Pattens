package Solid_Design_Principles.SingleResponsibilityPrinciple.NonSingleResponsibilty;

import java.util.HashMap;
import java.util.Map;

public class Store {

    final Map<String, User> users = new HashMap<>();

    //add
    public void addUser(User user) {
        synchronized (users) {
            users.put(user.getName(), user);
        }
    }

    //fetch
    public User getUser(String name) {
        synchronized (users) {
            return users.get(name);
        }
    }

    //remove
    public void removeUser(String name) {
        synchronized (users) {
            users.remove(name);
        }
    }
}
