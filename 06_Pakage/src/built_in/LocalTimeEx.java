package built_in;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);	// 15:55:04.572185400
		
		System.out.println(now.getHour());	// 16
		System.out.println(now.getMinute());	// 2
		System.out.println(now.getSecond());	// 46
		System.out.println(now.getNano());	// 903063800
		System.out.println(now.toNanoOfDay());	// 57766903063800
		System.out.println(now.toSecondOfDay());	// 57766
		System.out.println(now.toString());	// 16:02:46.903063800
		System.out.println(now.MAX);	// 23:59:59.999999999
		System.out.println(now.MIN);	// 00:00
		System.out.println(now.MIDNIGHT);	// 00:00
		System.out.println(now.NOON);	// 12:00
		System.out.println(now.plusHours(1L));	// 17:02:46.903063800
		System.out.println(now.plusMinutes(1L));	// 16:03:46.903063800
		System.out.println(now.plusSeconds(10L));	// 16:02:56.903063800
		System.out.println(now.plusNanos(10000L));	// 16:02:46.903073800
	}

}
