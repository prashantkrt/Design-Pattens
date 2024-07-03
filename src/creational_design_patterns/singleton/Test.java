package creational_design_patterns.singleton;

public class Test {
    /*
    * Utility classes
    * DB Connection
    * Reading/fetching data from property file
    * */
    public static void main(String[] args) {
        SingletonDesignPattern s = SingletonDesignPattern.getInstance();
        System.out.println(s.hashCode());
        SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
        System.out.println(s2.hashCode());

        SingletonDesignPatternLazy singletonDesignPatternLazy = SingletonDesignPatternLazy.getInstance();
        System.out.println(singletonDesignPatternLazy.hashCode());
        SingletonDesignPatternLazy singletonDesignPatternLazy2 = SingletonDesignPatternLazy.getInstance();
        System.out.println(singletonDesignPatternLazy2.hashCode());
    }
}


