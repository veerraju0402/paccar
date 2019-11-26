package com.incture.paccarmdm.mat.staging.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ServicesUtil {

	public static boolean isEmptyNumber(int str) {

		if (str == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(String str) {

		if (str == null || str.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isEmptyObject(Object obj) {
		if (obj == null || obj.equals(null)) {
			return true;
		}
		return false;
	}

	public static boolean isEmptyDate(Date obj) {
		if (obj == null || obj.equals(null)) {
			return true;
		}
		return false; 

	}

	public static Date getTime() {
		Date date1 = null;
		try {
			Date time = new Date();
			SimpleDateFormat ft1 = new SimpleDateFormat("dd MMMM yyyy, hh:mm a");
			TimeZone.setDefault(TimeZone.getTimeZone("IST"));
			String s1 = ft1.format(time);
			date1 = new SimpleDateFormat("dd MMMM yyyy, hh:mm a").parse(s1);
		} catch (ParseException e) {
			System.err.println("getTime:-" + e.getMessage());
			e.printStackTrace();
		}

		return date1; 
	}
	public static String DateToString(Date date){
		 
		String newstr = new SimpleDateFormat("dd MMMM yyyy, hh:mm a").format(date);
		System.err.println("DateToString:-" + newstr);
	return newstr;
	}
	
	public static Date StringToDate(String dateString,String time)
	{
		System.err.println(" String to Date:-"+dateString+" "+time);
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd MMMM yyyy, hh:mm a").parse(dateString+", "+time);
			System.err.println("StringToDate:-" + date1);
		} catch (ParseException e) {
			System.err.println("StringToDate Exception:-" + e.getMessage());
			e.printStackTrace();
		}
		return date1;
	}
	
	public static Date StringToDate(String dateString)
	{
		System.err.println(" String to Date:-"+dateString);
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd MMMM yyyy, hh:mm a").parse(dateString);
			System.err.println("StringToDate:-" + date1);
		} catch (ParseException e) {
			System.err.println("StringToDate Exception:-" + e.getMessage());
			e.printStackTrace();
		}
		return date1;
	}
}