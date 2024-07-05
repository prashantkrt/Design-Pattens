package creational_design_patterns.SingletonPattern;

public class SingletonDesignPatternLazy {

    private static SingletonDesignPatternLazy singletonDesignPatternLazy = null;

    private SingletonDesignPatternLazy() {
    }

    //Lazy Loading or Lazy Initialization
    public static SingletonDesignPatternLazy getInstance() {
        if (singletonDesignPatternLazy == null) {
            singletonDesignPatternLazy = new SingletonDesignPatternLazy();
        }
        return singletonDesignPatternLazy;
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

