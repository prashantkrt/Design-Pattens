package creational_design_patterns.PrototypePattern.example2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d= new Department(567);
        Employee e1 = new Employee("John", 20, 1,d);
        System.out.println(e1.hashCode()); //2055281021
//      clone() method is protected method of Object
//      System.out.println(e1.clone());  // we call call clone() method from Test obj not from other object

//      override the clone() method in employee class to use clone() method
        System.out.println(e1.clone().hashCode()); //1554547125

        System.out.println(e1.getDep().hashCode()); // 617901222
        Employee e=(Employee) e1.clone();
        System.out.println(e.getDep().hashCode()); // 617901222 this is why clone() is a shallow copy

    }
}
