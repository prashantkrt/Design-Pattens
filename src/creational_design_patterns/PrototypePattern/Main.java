package creational_design_patterns.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(20, 76, "Ram");
        //Creating the clone obj
        Student cloneObj = new Student();
        cloneObj.name = obj.name;
        cloneObj.age = obj.age;
        // cloneObj.rollNumber = obj.rollNumber(); we can't clone it as the field is private

    }
}
