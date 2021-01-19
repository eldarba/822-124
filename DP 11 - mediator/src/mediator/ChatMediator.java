package mediator;

public interface ChatMediator {

	void sendMessage(String messaage, User sender);

	void addUser(User user);

}
