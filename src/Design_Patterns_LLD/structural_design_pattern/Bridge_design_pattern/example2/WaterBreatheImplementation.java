package Design_Patterns_LLD.structural_design_pattern.Bridge_design_pattern.example2;

//Is-a
public class WaterBreatheImplementation implements BreatheImplementor {
    @Override
    public void breath() {
        System.out.println("breathe through Gills");
        System.out.println("breathe Oxygen from water");
        System.out.println("Release Carbon Dioxide");
    }
}
