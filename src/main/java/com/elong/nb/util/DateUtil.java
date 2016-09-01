package com.elong.nb.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;

public class DateUtil {

	public static DateTime toDateTime(Date date) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			return XsdDateTimeConverter.unmarshal(df.format(date));
		} catch (Exception e) {
			return new DateTime();
		}
	}
	
	public static Date toDate(String date) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			return df.parse(date);
		} catch (Exception e) {
			return new Date();
		}
	}
	
	public static Date addYears(Date date,int years){
		return addDate(GregorianCalendar.YEAR,date,years);
	}
	public static Date addMoths(Date date,int months){
		return addDate(GregorianCalendar.MONTH,date,months);
	}
	public static Date addDays(Date date,int days){
		return addDate(GregorianCalendar.DATE,date,days);
	}
	private static Date addDate(int type,Date date,int num){
		GregorianCalendar gc=new GregorianCalendar(); 
		gc.setTime(date); 
		gc.add(type,num); 
		return gc.getTime();
	}
	public static Date getMinValue(){
		return new Date(0,1,1);
	}
}
