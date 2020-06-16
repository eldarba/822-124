package b.interrupt;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		MySleepingThread t1 = new MySleepingThread("t1", 10_000);
		MySleepingThread t2 = new MySleepingThread("t2", 10_000);
		
		t1.start();
		t2.start();
		
		Thread.sleep(3000);
		
		t2.interrupt();

	}

}
