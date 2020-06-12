package b.waitNotify.simple;

public class NotifingThread extends Thread {

	private Object mutex;

	public NotifingThread(Object mutex) {
		super();
		this.mutex = mutex;
	}

	@Override
	public void run() {

		System.out.println("we are going to notify in");
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// acquire the object (mutex) monitor before invoking notify()
		synchronized (mutex) {
			mutex.notify();
		}
	}
}
