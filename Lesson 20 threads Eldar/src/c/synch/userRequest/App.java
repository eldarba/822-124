package c.synch.userRequest;

public class App {

	public static void main(String[] args) {

		RequestHandler requestHandler = new RequestHandler();

		Thread ran = new Thread(requestHandler, "Ran");
		Thread dan = new Thread(requestHandler, "Dan");
		Thread ann = new Thread(requestHandler, "Ann");

		ran.start();
		dan.start();
		ann.start();

	}

}
