package d.singleton;

/*
 * design Superman class as singleton so only one instance of superman is possible in a running application
 * */
public class Superman {

	// 2. create the one single instance of superman (inside the class)
	private static Superman instance = new Superman();

	// 1. private CTOR
	private Superman() {
	}

	// 3. provide a getter for the instance
	public static Superman getInstance() {
		return instance;
	}

}
