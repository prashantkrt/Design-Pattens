package creational_design_patterns.Singleton.scenarios_breaking_singleton;

public class CloningTest {
    public static void main(String[] args) throws CloneNotSupportedException {
       /*
       * Shallow cloning: changes in one entity are reflected in the other entities
       * example:
       * ABC obj1 = new ABC();
       * ABC obj2 = obj1; //pointing to the original
       *
       * Deep cloning: changes in one entity are not reflected in the other entities
       * ABC obj1 = new ABC();
       * ABC obj2 = new ABC();
       *
       * */


        Singleton s1 = Singleton.getInstance();
        Singleton s2 = (Singleton) s1.clone();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
