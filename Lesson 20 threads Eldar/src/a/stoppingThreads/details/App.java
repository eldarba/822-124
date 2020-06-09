package a.stoppingThreads.details;

public class App {

	public static void main(String[] args) {

		// get the user details
		DetailsGetter detailsGetter = new DetailsGetter();
		Thread getter = new Thread(detailsGetter, "getter thread");
		getter.start();

		// interrupt the user details getter
		StopDetailsGetter stopDetailsGetter = new StopDetailsGetter(detailsGetter);
		Thread stoper = new Thread(stopDetailsGetter, "stopper thread");
		stoper.start();

	}

}
