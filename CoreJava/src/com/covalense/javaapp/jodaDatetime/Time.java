package com.covalense.javaapp.jodaDatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;
@Log
public class Time {

	public static void main(String[] args) {
		
		//current date
		LocalDate a=LocalDate.now();
		log.info("Todays date is  "+a);
		//birthday
		LocalDate bir=LocalDate.of(1998, 11, 01);
		Period p=Period.between(bir, a);
		log.info(""+p);
		
		//current month
		log.info("Dayof month is "+a.getDayOfMonth());
		log.info("Day of year is "+a.getDayOfYear());
		log.info("Day of week is "+a.getDayOfWeek());
		log.info("Year is "+a.getYear());
		log.info("Month is"+a.getMonth());
		
		//current time
		LocalTime t=LocalTime.now();
		log.info("The local time is "+t);
		LocalDateTime t1=LocalDateTime.now();
		log.info("LocalDateTime"+t1);
		
		//zone id
		ZoneId z=ZoneId.systemDefault();
		log.info("zone is"+z);
		
		
		/*ZoneId t11=ZoneId.of("Australia/Syndi");
		ZonedDateTime ze=ZonedDateTime.now(t11);
		log.info(""+ze.toLocalDateTime());*/
	}
}
