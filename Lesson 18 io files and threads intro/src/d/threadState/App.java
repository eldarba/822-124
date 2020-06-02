package d.threadState;

public class App {

	public static void main(String[] args) throws InterruptedException {

		CounterThread t1 = new CounterThread("t1");
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());

		Thread.sleep(100);
		System.out.println(t1.getState());

		t1.join();
		System.out.println(t1.getState());

		System.out.println("main ended");

	}

}
