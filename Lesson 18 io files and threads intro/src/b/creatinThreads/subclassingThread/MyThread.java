package b.creatinThreads.subclassingThread;

//extends is NOT available anymore
public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i + " - " + this.getName());
		}
	}

}
