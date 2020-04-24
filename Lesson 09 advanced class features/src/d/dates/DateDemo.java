package d.dates;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		long ts = 5555555555555L;
		Date d = new Date(ts);
		System.out.println(d);

	}

}
