package Design_Patterns_LLD.behavioral_design_pattern.Mediator_design_pattern.example1;

class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " sends message: " + message);
        this.mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(this.name + " receives message: " + message);
    }
}
