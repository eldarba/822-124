package c.waitNotify.producerConsumer;

public class ProducerThread extends Thread {

	private Stack stack;
	private int numberOfIterations;

	public ProducerThread(Stack stack, int numberOfIterations, String name) {
		super(name);
		this.stack = stack;
		this.numberOfIterations = numberOfIterations;
	}

	@Override
	public void run() {

		for (int i = 0; i < numberOfIterations; i++) {
			int val = (int) (Math.random() * 101);
			stack.push(val);
		}
	}

}
