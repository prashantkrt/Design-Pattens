package structural_design_pattern.Bridge_design_pattern.example2;

// Is-a
public class LandBreatheImplementation implements BreatheImplementor {
    @Override
    public void breath() {
        System.out.println("Breathe through nose");
        System.out.println("Breathe from air");
        System.out.println("Exhale C02");
    }
}
