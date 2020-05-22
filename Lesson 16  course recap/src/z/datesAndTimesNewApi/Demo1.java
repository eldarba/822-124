package z.datesAndTimesNewApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {

	public static void main(String[] args) {
//		Date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("================");

//		Time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println("================");

//		DateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println("================");

//		Format

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String str = formatter.format(localDateTime);
		System.out.println(str);

		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy: hh:mm:ss a").format(localDateTime));
		System.out.println(DateTimeFormatter.ofPattern("dd/MMM/yyyy: HH:mm:ss").format(localDateTime));
		System.out.println(DateTimeFormatter.ofPattern("dd/MMM/yyyy G: HH:mm:ss").format(localDateTime));

		// Time Zone aware
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("time-zone name: " + DateTimeFormatter.ofPattern("z").format(zonedDateTime));
		System.out.println("generic time-zone name: " + DateTimeFormatter.ofPattern("v").format(zonedDateTime));
		System.out.println("localized zone-offset: " + DateTimeFormatter.ofPattern("O").format(zonedDateTime));

		System.out.println("local zone id: " + ZoneId.systemDefault());
//		System.out.println();
//		System.out.println("=== available zone ids ===");
//		Set<String> zoneIds = new TreeSet<>(ZoneId.getAvailableZoneIds());
//		for (String currZoneId : zoneIds) {
//			System.out.println(currZoneId);
//		}
//		System.out.println("=== ================== ===");

	}

}
