package command;

public class MacFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in Mac OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in Mac OS");
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in Mac OS");
	}

}
