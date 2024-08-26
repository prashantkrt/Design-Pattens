package Design_Patterns_LLD.structural_design_pattern.Bridge_design_pattern.example2;

public class Main {
    public static void main(String[] args) {
        LivingThings fishObj = new Fish(new WaterBreatheImplementation());
        fishObj.breatheProcess();
    }
}
