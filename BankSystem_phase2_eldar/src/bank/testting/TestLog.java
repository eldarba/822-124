package bank.testting;

import bank.core.Log;

public class TestLog {

	public static void main(String[] args) {

		Log log = new Log(System.currentTimeMillis(), 101, "testing", 1500);
		System.out.println(log.getData());
	}

}
