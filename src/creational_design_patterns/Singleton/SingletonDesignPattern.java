package creational_design_patterns.Singleton;

public class SingletonDesignPattern {
    // Eager Loading or Eager Initialization
    private static final SingletonDesignPattern singletonDesignPattern = new SingletonDesignPattern();

    private SingletonDesignPattern() {
    }

    public static SingletonDesignPattern getInstance() {
        return singletonDesignPattern;
    }
}
/*
 *
 * We can still break the singleton design pattern using :
 *
 * MultiThreading:
 * Reflection: which allows creating an object using private constructor
 * Cloning
 * Serialization
 *
 * */
