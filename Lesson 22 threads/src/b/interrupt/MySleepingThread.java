package b.interrupt;

public class MySleepingThread extends Thread {
	
	private int waitingTime;

	public MySleepingThread(String name, int waitingTime) {
		super(name);
		this.waitingTime = waitingTime;
	}

	@Override
	public void run() {
		System.out.println(getName() + " is going to sleep for " + waitingTime + " ms");
		
		try {
			Thread.sleep(this.waitingTime);
		} catch (InterruptedException e) {
			e.printStackTrace(System.out);
			System.out.println(getName() + " interrupted while sleeping");
			return;
		}

		System.out.println(getName() + " woke up after " + waitingTime + " ms");
	}
}
