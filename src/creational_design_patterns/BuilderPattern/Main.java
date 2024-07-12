package creational_design_patterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Karthik","Abc")
                    .age(10).phone("987654321")
                    .email("abc@bac")
                    .build();

        System.out.println(user);
    }
}
