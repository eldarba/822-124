package f.interrupt.app2;

public class CountTo10K extends Thread {

	public CountTo10K(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			System.out.println(i + " - " + getName());
			if (isInterrupted()) {
				for (int j = i; j >= 0; j--) {
					System.out.println(j + " - " + getName());
				}
				break;
			}
		}

	}

}
