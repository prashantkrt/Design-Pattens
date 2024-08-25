package structural_design_pattern.Composite_design_pattern.example1;

public class Main {
    public static void main(String[] args) {

        Faculty hod = new Faculty("Himanshu", 101, 100000.0, "CSE");
        Faculty prof1 = new Faculty("Nikhil", 112, 50000.0, "CSE");
        Faculty prof2 = new Faculty("Babu", 113, 75000.0, "CSE");
        Faculty asstProf1 = new Faculty("Ajay", 1121, 20000.0, "CSE");
        Faculty asstProf2 = new Faculty("Rahul", 1122, 10000.0, "CSE");
        Faculty asstProf3 = new Faculty("Ravi", 1123, 5000.0, "CSE");

        //Faculty reporting to HOD
        hod.addFaculty(prof1);
        hod.addFaculty(prof2);

        //Faculty reporting to Prof1
        prof1.addFaculty(asstProf1);
        prof1.addFaculty(asstProf2);

        //Faculty Reporting to Prof2
        prof2.addFaculty(asstProf3);

        System.out.println("Faculty reporting to HOD are *****");
        hod.printAllReporters();

        System.out.println("Faculty reporting to Prof 1 are *****");
        prof1.printAllReporters();

        System.out.println("Faculty reporting to Prof 2 are *****");
        prof2.printAllReporters();

        prof1.removeFaculty(asstProf2);
        System.out.println("Faculty reporting to Prof 1 are *****");
        prof1.printAllReporters();
    }
}
