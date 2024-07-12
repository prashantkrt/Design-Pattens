package creational_design_patterns.BuilderPattern;

// problem example which we will be solving through a builder design pattern

public class UserWithoutBuilder {
    private String firstName; //required
    private String lastName; //required
    private int age; //Not Required
    private String mobileNo; // Not Required

    // now what if we have 15 fields or more than that, we have to create many constructors
    // to get the object of required fields

    public UserWithoutBuilder(String firstName, String lastName, int age, String mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public UserWithoutBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
