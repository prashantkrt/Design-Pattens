package Design_Patterns_LLD.behavioral_design_pattern.ChainOfResponsibilityPattern;

public interface DispenseChain {
    void dispense(Currency currency);

    void chain(DispenseChain nextChain);
}
