package com.autobrixusedcar.dealer.utils;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import java.util.*;
@Component

public class Util {

	public static void closeConnection(Connection conn){
		try {
			if(conn != null &&  !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeResultSet(ResultSet rs){
		try {
			if(rs != null ){
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closePreparedStatement(PreparedStatement ps){
		try {
			if(ps != null){
				ps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStatement(Statement st){
		try {
			if(st != null ){
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeCallableStatement(CallableStatement cs){
		try {
			if(cs != null ){
				cs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String decode(String s) {
	    return new String(Base64.getDecoder().decode(s));
	}
	
	public static String encode(String s) throws UnsupportedEncodingException {
	    return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
	}
	
	public static String avoidNulls(String value){
		return (value==null?"":value);
	}
	
	public static Boolean isNull(Object value){
		return (value == null ? true : false);
	}
	
	public static String avoidNulls(String value,String defaultValue){
		return (value==null||value.equals(""))?defaultValue:value;
	}
	
	public static String avoidNulls(Object value,String defaultValue){
		return value==null?defaultValue:value.toString().trim();
	}
	
	public static Date formatDateToString(String date, String dtforamt) {
		SimpleDateFormat format = new SimpleDateFormat(dtforamt);
		
		try {
			return format.parse(date);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String formatDateToString(Date date, String dtforamt) {

		if(date == null) return "";

		SimpleDateFormat format = new SimpleDateFormat(dtforamt);
		return format.format(date);
	}
	
	
	public static String otpString( int len ){
		final String AB = "0123456789"; 
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder( len );
	   for( int i = 0; i < len; i++ ) 
	      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	   return sb.toString();
	}


	public static String getDay(Date dt1) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt1);
		String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		return dayOfWeek;
	}



	public static Date getDateFromString(String d, String dateFormat) throws ParseException {
		if (d == null || d.equalsIgnoreCase("")) return null;
		DateFormat format = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
		Date date = format.parse(d);
		return date;
	}


	public static String roundOffTo2DecPlaces(Double val) {
		return String.format("%.2f", val);
	}
	
	
	
	
	public static String coolFormat(double n, int iteration) {
		char[] c = new char[]{'k', 'm', 'b', 't'};

	    double d = ((long) n / 100) / 10.0;
	    boolean isRound = (d * 10) %10 == 0;//true if the decimal part is equal to 0 (then it's trimmed anyway)
	    return (d < 1000? //this determines the class, i.e. 'k', 'm' etc
	        ((d > 99.9 || isRound || (!isRound && d > 9.99)? //this decides whether to trim the decimals
	         (int) d * 10 / 10 : d + "" // (int) d * 10 / 10 drops the decimal
	         ) + "" + c[iteration]) 
	        : coolFormat(d, iteration+1));

	}
	
	
	
	
	
	
}
