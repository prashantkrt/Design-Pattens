package Design_Patterns_LLD.behavioral_design_pattern.Mediator_design_pattern.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList();

    public ChatMediatorImpl() {
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void sendMessage(String message, User sender) {
        Iterator iterator = this.users.iterator();

        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            if (user != sender) {
                user.receiveMessage(message);
            }
        }

    }
}
