package built_in;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();	
		System.out.println(today);	// 2021-11-10
		
		Date date = new Date();
		System.out.println(date);
		// Wed Nov 10 15:39:55 GMT+09:00 2021
		// => 구버전으로 변환과정이 다소 복잡하여 deprecated 될 것 같음
		
		System.out.println(today.getDayOfMonth()); // 10 11월의 인덱스는 10
		System.out.println(today.getDayOfYear());	// 314 일년 중 며칠 지났나
		System.out.println(today.getMonthValue());	// 11
		System.out.println(today.getYear());		// 2021
		System.out.println(today.getChronology());	// ISO
		System.out.println(today.getDayOfWeek());	// WEDNESDAY
		System.out.println(today.getEra());			// CE => 기원전 기원후
	}

}
