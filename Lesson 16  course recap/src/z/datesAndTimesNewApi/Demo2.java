package z.datesAndTimesNewApi;

import java.time.LocalDate;

public class Demo2 {

	public static void main(String[] args) {
//		Date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		date = LocalDate.of(1980, 1, 25);
		System.out.println(date);

		date = LocalDate.parse("2020-05-15");
		System.out.println(date);

	}

}
