package a.waitNotify.simple;

public class Demo1 {

	public static void main(String[] args) {

		Object mutex = new Object();
		Thread t = Thread.currentThread();
		
		// we can use lambda expression to create a runnable
		Runnable runnable = ()->{
			// this is the run method
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (mutex) {
				mutex.notify();
			}
		};
		
		String name = "the notifying thread";
		Thread t2 = new Thread(runnable, name);
		t2.start();

		try {
			synchronized (mutex) {
				System.out.println(t.getName() + " start waiting");
				mutex.wait();
				System.out.println(t.getName() + " notified");

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
