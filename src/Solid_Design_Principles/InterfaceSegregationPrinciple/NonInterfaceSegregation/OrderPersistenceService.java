package Solid_Design_Principles.InterfaceSegregationPrinciple.NonInterfaceSegregation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long,Order> order = new HashMap<>();

    @Override
    public void save(Order user) {
        synchronized (order) {
            order.put(user.getId(), user);
        }
    }

    @Override
    public void delete(Order user) {
        synchronized (order) {
            order.remove(user.getId());
        }

    }

    @Override
    public Order findById(Long id) {
        synchronized (order) {
            return order.get(id);
        }
    }

    // extra method has been overloaded which breaks the Interface Segregation Principle
    // as order didn't need name, it only needs orderId or order time, etc.
    @Override
    public List<Order> findByName(String name) {
        return List.of();
    }
}
