package command;

public class LinuxFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in Linux OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in Linux OS");
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in Mac OS");
	}

}
