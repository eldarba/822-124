package a.stoppingThreads.details;

public class App {

	public static void main(String[] args) {

		// main is an application thread (rather than daemon thread)
		System.out.println("is main daemon: " + Thread.currentThread().isDaemon());

		// get the user details
		DetailsGetter detailsGetter = new DetailsGetter();
		Thread getter = new Thread(detailsGetter, "getter thread");
		// the launched thread inherit its daemon status from current thread (main)
		getter.start();

		// interrupt the user details getter
		StopDetailsGetter stopDetailsGetter = new StopDetailsGetter(detailsGetter);
		Thread stoper = new Thread(stopDetailsGetter, "stopper thread");
		stoper.setDaemon(true);
		stoper.start();

	}

}
