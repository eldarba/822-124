package a.whatIsThread;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		// the main thread
		System.out.println(">>> main method runs within the main thread");

		// THREADS ARE REPRESENTED AS OBJECTS
		// getting a reference to the current thread
		Thread mainThread = Thread.currentThread();

		// THREAD HAS A NAME
		String threadName = mainThread.getName();
		System.out.println("thread name: " + threadName);

		// THREADS CAN BE PAUSED - using the sleep method
		System.out.println("pause for 5 seconds");
		Thread.sleep(5000);
		System.out.println("running again");

	}

}
