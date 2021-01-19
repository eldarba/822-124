package mediator;

public class UserImpl extends User {

	// CTOR from super class
	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(">>> " + name + " sending: " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println("<<< " + name + " received: " + msg);
	}

}
