package creational_design_patterns.PrototypePattern;

public class PrototypeMain {
    public static void main(String[] args) {
        Students students = new Students("Ram",21,45);
        Students studentsClone = (Students) students.clone();
    }
}
