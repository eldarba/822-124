package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users = new ArrayList<User>();

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendMessage(String messaage, User sender) {
		for (User currUser : users) {
			// message should not be received by the sender
			if (!currUser.equals(sender)) {
				currUser.receive(messaage);
			}
		}
	}

}
