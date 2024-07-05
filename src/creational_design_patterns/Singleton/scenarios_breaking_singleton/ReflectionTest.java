package creational_design_patterns.Singleton.scenarios_breaking_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//breaking using Refection
public class ReflectionTest {

    /*  getDeclaredFields()
     *  getDeclaredMethods()
     *  getDeclaredConstructors()
     * */

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton> reflection = Singleton.class.getDeclaredConstructor(); // will get all the private constructors array
        reflection.setAccessible(true); //making the private constructor call to true-> allows calling

        Singleton singletonObj = Singleton.getInstance();
        System.out.println(singletonObj.hashCode());

        Singleton singletonObj1 = (Singleton) reflection.newInstance(); // calling the private constructor and gets the new object
        Singleton singletonObj2 = (Singleton) reflection.newInstance(); // calling the private constructor and gets the new object

        // breaking the singleton design pattern
        System.out.println(singletonObj1.hashCode());
        System.out.println(singletonObj2.hashCode());

    }
}
