package c.synch.userRequest;

// we will create only one instance of this class
public class RequestHandler implements Runnable {

	private int requestId;

	/**
	 * this is a synchronized method
	 * 
	 * it is synchronized on the reference "this"
	 * 
	 * it means that threads that want to enter this method (run it) must have the
	 * key (only one) for "this"
	 */
	@Override
	public synchronized void run() {
		requestId++;
		Thread t = Thread.currentThread();
		System.out.println("hello " + t.getName() + " request id: " + requestId + " please wait...");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("thank you " + t.getName() + " your request id: " + requestId + " was received");

	}

}
