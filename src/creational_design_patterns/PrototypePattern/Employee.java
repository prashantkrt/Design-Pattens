package creational_design_patterns.PrototypePattern;

public class Employee {

    int empId;
    String empName;

    public Employee() {
    }

    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    public static void main(String[] args) {
        Employee e = new Employee(21, "Ravi");
        Employee e2 = new Employee();
        e2.empId = e.empId;
        e2.empName = e.empName; // what if it has 100 attributes ....Ï
    }

}
