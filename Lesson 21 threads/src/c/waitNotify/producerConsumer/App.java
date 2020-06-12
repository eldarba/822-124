package c.waitNotify.producerConsumer;

public class App {

	public static void main(String[] args) {

		Stack stack = new Stack();

		int numberOfProducers = 2;
		int producerIterrations = 1500;

		int numberOfConsumers = 1500;
		int consumerIterrations = 2;

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
