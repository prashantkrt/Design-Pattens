package structural_design_pattern.Bridge_design_pattern.example2;

public abstract class LivingThings {
    //Has-a
    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
