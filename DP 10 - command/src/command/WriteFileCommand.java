package command;

public class WriteFileCommand implements Command {

	// attribute
	private FileSystemReceiver fsCommandReceiver;

	public WriteFileCommand(FileSystemReceiver fsCommandReceiver) {
		super();
		this.fsCommandReceiver = fsCommandReceiver;
	}

	@Override
	public void execute() {
		// forward the request to command receiver
		fsCommandReceiver.writeFile();
	}

}
