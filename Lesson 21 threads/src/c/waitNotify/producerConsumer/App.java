package c.waitNotify.producerConsumer;

public class App {

	public static void main(String[] args) {

		System.out.println("starting");

		Stack stack = new Stack();

		int numberOfProducers = 3;
		int producerIterrations = 4;

		int numberOfConsumers = 2;
		int consumerIterrations = 6;

		if (numberOfProducers * producerIterrations != numberOfConsumers * consumerIterrations) {
			throw new RuntimeException("too many producers / consumers!");
		}

		// create and start producers
		for (int i = 1; i <= numberOfProducers; i++) {
			ProducerThread p = new ProducerThread(stack, producerIterrations, "p" + i);
			p.start();
		}

		// create and start consumers
		for (int i = 1; i <= numberOfConsumers; i++) {
			ConsumerThread c = new ConsumerThread(stack, consumerIterrations, "c" + i);
			c.start();
		}

//		ProducerThread p1 = new ProducerThread(stack, "p1");
//		ConsumerThread c1 = new ConsumerThread(stack, "c1");
//		p1.start();
//		c1.start();

	}

}
