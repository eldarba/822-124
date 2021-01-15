package command;

public class OpenFileCommand implements Command {

	// attribute
	private FileSystemReceiver fsCommandReceiver;

	public OpenFileCommand(FileSystemReceiver fsCommandReceiver) {
		super();
		this.fsCommandReceiver = fsCommandReceiver;
	}

	@Override
	public void execute() {
		// forward the request to command receiver
		fsCommandReceiver.openFile();
	}

}
