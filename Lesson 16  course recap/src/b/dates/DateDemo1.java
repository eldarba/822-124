package b.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo1 {

	public static void main(String[] args) {

		// timestamp
		long ts = System.currentTimeMillis();
		System.out.println("time stamp");
		System.out.println(ts);
		System.out.println("==================");

		// java.util.Date
		Date dateUtil = new Date();
		System.out.println("java.util.Date");
		System.out.println(dateUtil);
		System.out.println("==================");

		// java.sql.Date format: yyyy-MM-dd
		java.sql.Date dateSql = new java.sql.Date(ts);
		System.out.println("java.sql.Date");
		System.out.println(dateSql);
		System.out.println("==================");

		// java.util.Calendar - abstract class
		// java.util.GregorianCalendar - concrete class
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar");
		System.out.println(cal);
		cal.set(1980, Calendar.JANUARY, 25, 0, 0, 0);
		System.out.println(cal);

		System.out.println(cal.getTime());

		cal = new GregorianCalendar(1970, Calendar.MAY, 19);
		System.out.println(cal.getTime());
		System.out.println("==================");

		System.out.println("java.time - new API");
		// new API
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		dateTime = LocalDateTime.of(2020, 1, 25, 0, 0);
		System.out.println(dateTime);

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

	}

}
