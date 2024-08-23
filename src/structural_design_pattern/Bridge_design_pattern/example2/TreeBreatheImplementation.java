package structural_design_pattern.Bridge_design_pattern.example2;

//Is-a
public class TreeBreatheImplementation implements BreatheImplementor {

    @Override
    public void breath() {
        System.out.println("Breathe through leaves");
        System.out.println("Inhale C02");
        System.out.println("Exhale Oxygen through photosynthesis");
    }
}
