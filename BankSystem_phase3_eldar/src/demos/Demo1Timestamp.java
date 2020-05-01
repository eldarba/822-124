package demos;

import java.util.Date;

public class Demo1Timestamp {

	public static void main(String[] args) {
		long ts = System.currentTimeMillis();
		System.out.println(ts);

		Date date = new Date(ts);
		System.out.println(date);
	}

}
