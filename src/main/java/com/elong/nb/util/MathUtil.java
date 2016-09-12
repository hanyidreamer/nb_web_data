package com.elong.nb.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathUtil {

	public static Double Log(int value, int base){
		return Math.log(value) / Math.log(base);
	}
	public static boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}
}
