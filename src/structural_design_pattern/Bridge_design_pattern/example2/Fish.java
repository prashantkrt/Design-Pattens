package structural_design_pattern.Bridge_design_pattern.example2;

public class Fish extends LivingThings {

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breath();
    }
}
