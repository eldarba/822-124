package c.waitNotify.producerConsumer;

public class ConsumerThread extends Thread {

	private Stack stack;
	private int numberOfIterations;

	public ConsumerThread(Stack stack, int numberOfIterations, String name) {
		super(name);
		this.stack = stack;
		this.numberOfIterations = numberOfIterations;
	}

	@Override
	public void run() {
		for (int i = 0; i < numberOfIterations; i++) {
			stack.pop();
		}
	}
}
