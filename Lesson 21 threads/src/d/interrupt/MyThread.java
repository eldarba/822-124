package d.interrupt;

public class MyThread extends Thread {

	@Override
	public void run() {

		/*
		 * this demo shows 3 methods
		 * 
		 * 1. interrupt() - dynamic
		 * 
		 * 2. isInterrupted() - dynamic
		 * 
		 * 3. Thread.interrupted() - static
		 */

		System.out.println(this.isInterrupted()); // interrupted status not cleared
		this.interrupt(); // interrupting a thread (set the interrupted status)

		// check interrupted status (using 2 different methods)
		System.out.println(this.isInterrupted()); // interrupted status not cleared
		System.out.println(this.isInterrupted()); // interrupted status not cleared

		// the static version of the check method, clears the interrupted status
		System.out.println(Thread.interrupted()); // interrupted status IS cleared
		System.out.println(this.isInterrupted());
	}
}
