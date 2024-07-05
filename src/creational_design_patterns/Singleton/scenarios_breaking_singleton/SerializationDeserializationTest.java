package creational_design_patterns.Singleton.scenarios_breaking_singleton;


import java.io.*;

public class SerializationDeserializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialization
        FileOutputStream fos = new FileOutputStream("/Users/prashantkumartiwary/Documents/serialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Singleton.getInstance());
        oos.close();

        //deserialization
        FileInputStream fis = new FileInputStream("/Users/prashantkumartiwary/Documents/serialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton singleton = (Singleton) ois.readObject(); // gives the new object
        // internally calls readResolve() which we can override in the class to make it singleton
        System.out.println(singleton);
        System.out.println(singleton.hashCode());//1555093762 without readResolve()

        Singleton singleton2 = Singleton.getInstance();;
        System.out.println(singleton2.hashCode());//1494279232
        //breaks the singleton pattern

    }
}
