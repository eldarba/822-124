package a.dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UtilDateAndSqlDate {

	public static void main(String[] args) {

		// java.util.Date
		java.util.Date utilDate1 = new java.util.Date();
		java.util.Date utilDate2 = new GregorianCalendar(1985, Calendar.MARCH, 25).getTime();

		System.out.println(utilDate1);
		System.out.println(utilDate2);

		// java.sql.Date from java.util.Date
		java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
		java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());

		System.out.println(sqlDate1);
		System.out.println(sqlDate2);

		// java.util.Date from java.sql.Date
		utilDate1 = new java.util.Date(sqlDate1.getTime());
		utilDate2 = new java.util.Date(sqlDate2.getTime());

		System.out.println(utilDate1);
		System.out.println(utilDate2);

	}

}
