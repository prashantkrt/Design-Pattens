package creational_design_patterns.singleton.scenarios_breaking_singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance = null;

    private Singleton() {
    }

    // we have to use synchronized for multithreading case scenarios
    // static synchronized for multi object threading


//    public synchronized static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//

    // suppose we have 100 or more lines of code then the entire method will be blocked
//    public static Singleton getInstance() {
//        synchronized (Singleton.class) {
//            if (instance == null) {
//                instance = new Singleton();
//            }
//            return instance;
//        }
//    }

    //double check
    // if an object is null then only enter the synchronized block
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // we can synchronization of few parts

// for handling the serialization and deserialization case
//    Object readResolve() {
//        return instance;
//    }

}

//synchronized (Singleton.class){
//
//}
//If the instance is null, the thread enters the synchronized block.
//The synchronized block ensures that only one thread can execute the block at a time.
//Other threads attempting to enter the block will be blocked until the current thread exits the block.

//if (instance == null) {
//instance = new Singleton();
//}
//
//
//The thread that enters the synchronized block performs the second null check.
//This second check is crucial because while the first thread is creating the instance,
//other threads could be waiting to enter the synchronized block. Without the second check,
//each waiting thread could create a new instance once it acquires the lock,
//leading to multiple instances being created.



