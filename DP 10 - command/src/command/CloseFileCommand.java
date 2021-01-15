package command;

public class CloseFileCommand implements Command {

	// attribute
	private FileSystemReceiver fsCommandReceiver;

	public CloseFileCommand(FileSystemReceiver fsCommandReceiver) {
		super();
		this.fsCommandReceiver = fsCommandReceiver;
	}

	@Override
	public void execute() {
		// forward the request to command receiver
		fsCommandReceiver.closeFile();
	}

}
