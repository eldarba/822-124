package a.deadlock;

public class MyThread extends Thread {

	private Key key1;
	private Key key2;

	public MyThread(Key key1, Key key2, String name) {
		super(name);
		this.key1 = key1;
		this.key2 = key2;
	}

	@Override
	public void run() {

		System.out.println(getName() + " started. requesting monitor for " + key1);
		synchronized (key1) {
			System.out.println(getName() + " owns monitor for" + key1);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(getName() + " requesting monitor for " + key2);
			synchronized (key2) {
				System.out.println(getName() + " owns monitor for" + key2);

			}
		}

		System.out.println(getName() + " finished.");
	}
}
