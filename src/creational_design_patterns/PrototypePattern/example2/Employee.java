package creational_design_patterns.PrototypePattern.example2;

public class Employee implements Cloneable {

    private String name;
    private int age;
    private int empId;
    private Department dep;

    public Employee() {
    }

    public Employee(String name, int age, int empId, Department dep) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", empId=" + empId +
                ", dep=" + dep +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow cloning
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmpId() {
        return empId;
    }

    public Department getDep() {
        return dep;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("John", 20, 1, new Department(124));
        System.out.println(e1.hashCode());
        System.out.println(e1.clone());
        System.out.println(e1.clone().hashCode());
    }
}
