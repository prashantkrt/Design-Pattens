package Design_Patterns_LLD.behavioral_design_pattern.Mediator_design_pattern.example1;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String var1);

    public abstract void receiveMessage(String var1);
}
