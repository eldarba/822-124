package command.client;

import command.FileSystemReceiver;
import command.LinuxFileSystemReceiver;
import command.MacFileSystemReceiver;
import command.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getReceiver() {
		String osName = System.getProperty("os.name");
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else if (osName.contains("Linux")) {
			return new LinuxFileSystemReceiver();
		} else {
			return new MacFileSystemReceiver();
		}
	}

}
