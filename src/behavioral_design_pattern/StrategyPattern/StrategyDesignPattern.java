package behavioral_design_pattern.StrategyPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Instead of implementing a single algorithm directly, code receives run-time
// instructions as which family fo algorithm to use.
// application can switch strategies at run-time.

//Example of comparator and comparable
class Employee implements Comparable<Employee> {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.salary, o.salary);
    }
}

public class StrategyDesignPattern {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee( "Alex", 1000));
        employees.add(new Employee( "Bob", 2000));
        employees.add(new Employee( "Charlie", 3000));
        employees.add(new Employee( "Dan", 4000));
        employees.add(new Employee( "Jack", 5000));

        // during runtime, we are distinguishing sorting of List<Employees>
        Collections.sort(employees);
        System.out.println(employees);

        // during runtime, we are distinguishing sorting of List<Employees>
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o2.getSalary(), o1.getSalary());
            }
        });
        System.out.println(employees);
    }
}
