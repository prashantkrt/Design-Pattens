package Solid_Design_Principles.InterfaceSegregationPrinciple.InterfaceSegregation;

public interface PersistenceService<T> {

    public void save(T t);

    public void delete(T t);

    public T findById(Long id);

    // will remove all the extra method which is not common in it's impl classes
}
