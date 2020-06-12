package b.waitNotify.simple;

public class App {

	public static void main(String[] args) {
		
		// mutex = Mutual Exclusive Object
		// mutex critical sections can be ran by
		// 1 thread only at a time
		Object mutex = new Object();
		
		WaitingThread waitingThread = new WaitingThread(mutex);
		NotifingThread notifingThread = new NotifingThread(mutex);
		
		waitingThread.start();
		notifingThread.start();

	}

}
