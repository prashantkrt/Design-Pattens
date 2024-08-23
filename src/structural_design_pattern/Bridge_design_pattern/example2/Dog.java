package structural_design_pattern.Bridge_design_pattern.example2;

public class Dog extends LivingThings{

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
       breatheImplementor.breath();
    }
}
