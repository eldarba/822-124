package e.interrupt.app1;

public class CountTo10K extends Thread {

	public CountTo10K(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			System.out.println(i + " - " + getName());
			if (isInterrupted()) {
				break;
			}
		}

		if (isInterrupted()) {
			System.out.println(getName() + " was interrupted");
		} else {
			System.out.println(getName() + " was terminated normally");
		}
	}

}
