package creational_design_patterns.PrototypePattern;

public class Students implements Prototype{
    private String name;
    private int age;
    private int rollNumber;

    public Students() {}

    public Students(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    @Override
    public Prototype clone() {
        return new Students(name, age, rollNumber);
    }
}
