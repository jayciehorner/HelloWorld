package com.skillstorm.training.week08.day4;
import java.time.format.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.text.NumberFormat;
import java.time.*;
public class DateFormatting {

	public static void main(String[] args) {
		//////////////////////////////////////////////////////
		// TODO put in the chat the following code printed out
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		/*
		 * MM is month M would give me 5 without the leading 0 
		 *             MM gives me 05 
		 *             MMM gives me Jan 
		 *             MMMM gives me January
		 * dd is day d is the day without the leading zero for example 1
		 *           dd is the day with a leading zero
		 */
		
		System.out.println(LocalDate.now().format(formatter1));
		System.out.println(LocalDate.now().plusMonths(1).format(formatter2));
		System.out.println(LocalDate.now().plusMonths(1).format(formatter3));
		System.out.println(LocalDate.now().format(formatter4));
		System.out.println(LocalDate.now().format(formatter5));
		
		System.out.println(LocalDate.now());
		
		LocalDate date1 = LocalDate.parse("2023/05/18", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(date1);
		
		/*------------------------------------------------------------------
		 * TODO put in the chat the current time formatted 3 different ways
		 *-----------------------------------------------------------------
		 **/
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		System.out.println(time.format(DateTimeFormatter.ofPattern("hh a mm ")));
		System.out.println(time.format(DateTimeFormatter.ofPattern("h a")));
		System.out.println(time.format(DateTimeFormatter.ofPattern("HH a")));
		System.out.println(time.minusMinutes(30).format(DateTimeFormatter.ofPattern("hh:mm a")));
		System.out.println(time.minusHours(10).minusMinutes(30).format(DateTimeFormatter.ofPattern("HHmm")));
//		System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
//		System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
		
		// Without a formatter, we can still get these parts of the time
		System.out.print(time.getHour() + ":");
		System.out.print(time.getMinute()+ ":");
		System.out.println(time.getSecond());
		
		// Is the day over?
		LocalTime timeA = LocalTime.now();
		LocalTime timeB = LocalTime.of(18,0);
		System.out.print("Is the day over? ");
		System.out.println(timeA.isAfter(timeB));
		System.out.print("Is there still time to learn cool stuff? ");
		System.out.println(timeA.isBefore(timeB));
		System.out.println(ChronoUnit.SECONDS.between(timeA, timeB) > 0);
		

		DateTimeFormatter formatter6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatter7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formatter9 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
		System.out.println(formatter6.format(LocalDate.now()));
////		System.out.println(formatter6);
////		System.out.println(formatter7);
////		System.out.println(formatter8);
		System.out.println(formatter9.format(LocalDateTime.now()));
		
		LocalDateTime firstOfMonth = LocalDateTime.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstOfMonth);
		
		// Working with date time offsets between time zones
		// We can use the ZoneOffset class
		// and the OffsetDateTime object
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		ZoneOffset offset = ZoneOffset.of("+02:00");
		
		// Period or Duration.between(timeA, timeB)
		// Period.between(timeA, timeB)
		
		
		////////////////////////////////////////////////////////////////
		// Number formatting and Currency formatting
		NumberFormat nf1 = NumberFormat.getInstance(Locale.CANADA);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMANY);
		NumberFormat nf3 = NumberFormat.getInstance(Locale.FRANCE);
		double x = 180000.087;
		System.out.println(nf1.format(x));
		System.out.println(nf2.format(x));
		System.out.println(nf3.format(x));

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.CANADA);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat nf7 = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.println(nf4.format(x));
		System.out.println(nf5.format(x));
		System.out.println(nf6.format(x));
		System.out.println(nf7.format(x));
	}

}