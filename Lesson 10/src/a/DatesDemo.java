package a;

import java.util.Calendar;
import java.util.Date;

public class DatesDemo {

	public static void main(String[] args) {

		// use java.util.Date CTOR
		Date now = new Date();
		System.out.println(now);

		// use java.util.Calendar
		// 25/03/1980
		Calendar cal = Calendar.getInstance();
//		Calendar cal = new GregorianCalendar();
		cal.set(1980, Calendar.MARCH, 25);
		Date myDate = cal.getTime();
		System.out.println(myDate);

		// create a date from timestamp
		long ts = System.currentTimeMillis();
		ts -= 1000 * 60 * 60 * 24;
		Date dateTs = new Date(ts);
		System.out.println(dateTs);

		// advance myDate by 5 days
		System.out.println("===========");
		System.out.println(myDate);
		cal.setTime(myDate);
		cal.add(Calendar.DAY_OF_MONTH, 5);
		myDate = cal.getTime();
		System.out.println(myDate);

		System.out.println("==============");
		System.out.println(dateTs.before(myDate));
		System.out.println(dateTs.after(myDate));

	}

}
