package structural_design_pattern.Bridge_design_pattern.example2;

public class Tree extends LivingThings{

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breath();
    }
}
