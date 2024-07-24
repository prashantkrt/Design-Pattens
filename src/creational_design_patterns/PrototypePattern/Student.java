package creational_design_patterns.PrototypePattern;

public class Student {

    String name;
    int age;
    private int rollNumber;

    public Student() {

    }

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
}
