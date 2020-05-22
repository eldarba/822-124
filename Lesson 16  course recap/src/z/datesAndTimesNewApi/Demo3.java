package z.datesAndTimesNewApi;

import java.time.LocalDate;

public class Demo3 {

	public static void main(String[] args) {

//		plus / minus
		LocalDate now = LocalDate.now();
		System.out.println("Now: " + now);

		LocalDate tommorow = LocalDate.now().plusDays(1);
		System.out.println("Tommorow: " + tommorow);

		LocalDate nextMonth = LocalDate.now().plusMonths(1);
		System.out.println("Next Month: " + nextMonth);

		// there are more options of plus and minus

//		leap year
		System.out.println(now.isLeapYear());

//		before after
		System.out.println(now.isBefore(tommorow));
		System.out.println(now.isAfter(tommorow));

	}

}
