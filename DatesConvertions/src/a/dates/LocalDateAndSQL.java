package a.dates;

import java.time.LocalDate;

public class LocalDateAndSQL {

	public static void main(String[] args) {

		// LocalDate
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(1980, 1, 25);

		System.out.println(localDate1);
		System.out.println(localDate2);

		// java.sql.Date from LocalDate
		java.sql.Date sqlDate1 = java.sql.Date.valueOf(localDate1);
		java.sql.Date sqlDate2 = java.sql.Date.valueOf(localDate2);

		System.out.println(sqlDate1);
		System.out.println(sqlDate2);

		// LocalDate from java.sql.Date
		localDate1 = sqlDate1.toLocalDate();
		localDate2 = sqlDate2.toLocalDate();

		System.out.println(localDate1);
		System.out.println(localDate2);

	}

}
