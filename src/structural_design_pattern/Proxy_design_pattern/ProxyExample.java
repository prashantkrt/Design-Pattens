package structural_design_pattern.Proxy_design_pattern;

public class ProxyExample {
    public static void main(String[] args) {
        Policy policy = new InsuranceAgent("John Doe", "Auto", 50000, 1000, "ABC Insurance");
        policy.getPolicyDetails();
    }
}
