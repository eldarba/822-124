package z.datesAndTimesNewApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Demo4 {
	public static void main(String[] args) {

		Date dateUtil = new Date();

//		convert java.util.Date to localDateTime
		LocalDateTime localDateTime = LocalDateTime.ofInstant(dateUtil.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime);

//		convert localDateTime to java.util.Date
		dateUtil = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(dateUtil);

//		convert java.sql.Date to localDate
		java.sql.Date dateSql = new java.sql.Date(0);
		LocalDate localDate = dateSql.toLocalDate();
		System.out.println(localDate);

	}

}
