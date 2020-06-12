package b.waitNotify.simple;

public class WaitingThread extends Thread {
	
	private Object mutex;

	public WaitingThread(Object mutex) {
		super();
		this.mutex = mutex;
	}
	
	@Override
	public void run() {
		
		synchronized (mutex) {
			System.out.println("we are waiting");
			try {
				mutex.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("we are up");
	}

}
