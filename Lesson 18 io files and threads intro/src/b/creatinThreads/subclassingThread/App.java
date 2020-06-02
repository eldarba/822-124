package b.creatinThreads.subclassingThread;

public class App {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");

		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();

		System.out.println("main ended");

	}

}
