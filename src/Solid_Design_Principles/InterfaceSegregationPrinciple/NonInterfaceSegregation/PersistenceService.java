package Solid_Design_Principles.InterfaceSegregationPrinciple.NonInterfaceSegregation;

import java.util.List;

public interface PersistenceService<T> {
    // implicitly public and abstract
    public void save(T t);
    public void delete(T t);
    public T findById(Long id);
    public List<T> findByName(String name);
}
