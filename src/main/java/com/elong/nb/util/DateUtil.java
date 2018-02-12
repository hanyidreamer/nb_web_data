package com.elong.nb.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	public static Date toDate(String date) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			return df.parse(date);
		} catch (Exception e) {
			return new Date();
		}
	}

	private static SimpleDateFormat hhmmdf = new SimpleDateFormat("HH:mm");

	public static Date toDateHour(String dateHour) throws Exception {
		return hhmmdf.parse(dateHour);
	}

	public static Date addYears(Date date, int years) {
		return addDate(Calendar.YEAR, date, years);
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
	public static Date getDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	private static SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

	public static String getTimeString(Date date) {
		return sdfTime.format(date);
	}

	public static String getTimeString(String hourMinute, String stayTime) throws Exception {
		Date hourMinuteDate = toDateHour(hourMinute);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(hourMinuteDate);
		calendar.add(Calendar.HOUR_OF_DAY, Integer.valueOf(stayTime));
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return hhmmdf.format(new Date(calendar.getTimeInMillis()));
	}

	private static SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");

	public static String getDateString(Date date) {
		return sdfDate.format(date);
	}

}
