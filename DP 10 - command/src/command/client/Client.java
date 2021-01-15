package command.client;

import command.CloseFileCommand;
import command.FileSystemReceiver;
import command.Invoker;
import command.OpenFileCommand;
import command.WriteFileCommand;

public class Client {

	public static void main(String[] args) {

		// get a receiver instance for the underlying OS
		FileSystemReceiver fsCommandReceiver = FileSystemReceiverUtil.getReceiver();
//		FileSystemReceiver fsCommandReceiver = new MacFileSystemReceiver();
		System.out.println(fsCommandReceiver.getClass());

		// =========== the long way
		// 1. create a command and attach receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fsCommandReceiver);

		// 2. create invoker and attach command
		Invoker invoker = new Invoker(openFileCommand);

		// 3. perform the action using the invoker
		invoker.doCommand();

		System.out.println("=======================");
		// =========== the long way
		Invoker openfileInvoker = new Invoker(new OpenFileCommand(fsCommandReceiver));
		Invoker writefileInvoker = new Invoker(new WriteFileCommand(fsCommandReceiver));
		Invoker closefileInvoker = new Invoker(new CloseFileCommand(fsCommandReceiver));

		openfileInvoker.doCommand();
		writefileInvoker.doCommand();
		closefileInvoker.doCommand();

		System.out.println("=======================");
		// very short
		new Invoker(new OpenFileCommand(fsCommandReceiver)).doCommand();

	}

}
