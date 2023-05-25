package com.skillstorm.training.week08.day4;
import java.time.*;
public class DateExamples {
public static void main(String[] agrs) {
	// LocalDate
	System.out.println(LocalDate.now());
	
	// LocalTime
	System.out.println(LocalTime.now());

	// LocalDateTime
	System.out.println(LocalDateTime.now());

	// ZonedDateTime
	System.out.println(ZonedDateTime.now());
	
	System.out.println(LocalDate.now().minusDays(90));
	//System.out.println(LocalDate.of(2023, 2, 29)); // cannot find an invalid day of month (2023 was not a leap year)
	System.out.println(LocalDate.of(2024, 2, 29)); // is a leap year
	
	//ZoneId.getAvailableZoneIds().stream().filter(x -> x.contains("US") || x.contains("America")).forEach(System.out::println);
	

}
}
