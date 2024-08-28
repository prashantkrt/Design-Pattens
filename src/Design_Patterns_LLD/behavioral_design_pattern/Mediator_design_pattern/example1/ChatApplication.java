package Design_Patterns_LLD.behavioral_design_pattern.Mediator_design_pattern.example1;

public class ChatApplication {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new ChatUser(mediator, "Mohan");
        User user2 = new ChatUser(mediator, "Ravi");
        User user3 = new ChatUser(mediator, "Kumar");

        user1.sendMessage("Hello, everyone!"); // Mohan sends the message → broadcast
        System.out.println("************");
        user2.sendMessage("How are you guys"); // all others will receive the message
    }
}
