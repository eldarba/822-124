package command;

public class Invoker {

	// attribute
	private Command command;

	// CTOR
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void doCommand() {
		this.command.execute();
	}

}
