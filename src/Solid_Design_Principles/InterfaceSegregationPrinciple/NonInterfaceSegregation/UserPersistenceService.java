package Solid_Design_Principles.InterfaceSegregationPrinciple.NonInterfaceSegregation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPersistenceService implements PersistenceService<User> {

    private final static Map<Long, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        synchronized (users) {
            users.put(user.getId(), user);
        }
    }

    @Override
    public void delete(User user) {
        synchronized (users) {
            users.remove(user.getId());
        }
    }

    @Override
    public User findById(Long id) {
        synchronized (users) {
            return users.get(id);
        }
    }

    @Override
    public List<User> findByName(String name) {
        synchronized (users) {
            return users.values().stream().filter(i -> i.getName().equalsIgnoreCase(name)).toList();
        }
    }
}
