package structural_design_pattern.Composite_design_pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String name;
    private int id;
    private double salary;
    private String depName;
    List<Faculty> directReporters = null;

    public Faculty(String name, int id, double salary, String depName) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.depName = depName;
        this.directReporters = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepName() {
        return this.depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    void addFaculty(Faculty f) {
        this.directReporters.add(f);
    }

    void removeFaculty(Faculty f) {
        this.directReporters.remove(f);
    }

    void printAllReporters() {
        System.out.println("Reporters are ");
        for(int i = 0; i < directReporters.size(); ++i) {
            System.out.println(((Faculty)this.directReporters.get(i)).getName() + " and faculty id is " + ((Faculty)this.directReporters.get(i)).getId());
        }
    }

}
