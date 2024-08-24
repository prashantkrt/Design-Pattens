package behavioral_design_pattern.State_design_pattern.example1;

public interface PolicyStatus {
    void expirePolicy(Policy policy);
    void cancelPolicy(Policy policy);
    void renewPolicy(Policy policy);
}
