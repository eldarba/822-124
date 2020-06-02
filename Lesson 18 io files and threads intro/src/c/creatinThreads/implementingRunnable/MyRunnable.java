package c.creatinThreads.implementingRunnable;

// extends is still available
public class MyRunnable implements Runnable {

	@Override
	public void run() {

		// in order to invoke Thread instance methods we need a reference to the
		// currently executing thread object
		Thread t = Thread.currentThread();

		for (int i = 1; i <= 1000; i++) {
			System.out.println(i + " - " + t.getName());
		}
	}

}
