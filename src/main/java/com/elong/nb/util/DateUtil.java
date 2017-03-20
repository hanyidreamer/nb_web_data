package com.elong.nb.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.joda.time.DateTime;

public class DateUtil {
	private static  Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	
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

	public static Date addYears(Date date, int years) {
		return addDate(Calendar.YEAR, date, years);
	}

	public static Date addMoths(Date date, int months) {
		return addDate(Calendar.MONTH, date, months);
	}

	public static Date addDays(Date date, int days) {
		return addDate(Calendar.DATE, date, days);
	}

	private static Date addDate(int type, Date date, int num) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(type, num);
		return gc.getTime();
	}

	public static Date getMinValue() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1970, 0, 1, 0, 0, 0);
		return calendar.getTime();
	}
	/**
	 * 获取日期部分
	 * @param date
	 * @return
	 */
	public static Date getDate(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	public static String getTimeString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}

	public static String getDateString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	public static String formatDate(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
}
