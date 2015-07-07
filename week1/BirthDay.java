package week1;

/**
 * 2015년 2학기 Programming In Java 1주차 과제
 * @author 윤영기
 * @date 2015.7.7
 * @version 1.0
 */

public class BirthDay {
	private int year;
	private int month;
	private int day;
	
	public BirthDay(int year, int month, int day) {
		this.year  = year;
		this.month = month;
		this.day   = day;
	}
	
	public boolean isValidDate(BirthDay birthDay) {
		boolean isValidMonth    = false;
		boolean isValidDay      = false;
		boolean isMonthOf31days = false;
		boolean isLeapYear      = false;
		
		isValidMonth = checkValidMonth(birthDay.month);
		
		if (isValidMonth == false) {
			return false;
		}
		
		isValidDay = checkValidDay(birthDay.day);
		
		if (isValidDay == false) {
			return false;
		}
		
		isMonthOf31days = checkMonthOfDays(birthDay.month);
		
		if (isMonthOf31days == false && birthDay.day == 31) {
			return false;
		}
		
		isLeapYear = checkLeapYear(birthDay.year);
		
		if (isLeapYear == true && birthDay.month == 2 && birthDay.day > 29) {
			return false;
		}
		
		if (isLeapYear == false && birthDay.month == 2 && birthDay.day > 28) {
			return false;
		}
		
		return true;
	}

	private boolean checkValidMonth(int month) {
		boolean isValidMonth = (month > 0 && month < 13);
		
		return isValidMonth;
	}
	
	private boolean checkValidDay(int day) {
		boolean isValidDay = (day > 0 && day < 32);
		
		return isValidDay;
	}
	
	private boolean checkMonthOfDays(int month) {
		boolean isMonthOf31Days = false;
		boolean isEvenMonth = (month % 2 == 0);
		
		if (isEvenMonth == true || month > 7) {
			isMonthOf31Days = true;
		}
		
		if (isEvenMonth == false || month < 8) {
			isMonthOf31Days = true;
		}
		
		return isMonthOf31Days;
	}

	private boolean checkLeapYear(int year) {
		boolean isLeapYear = false;
		
		if (year % 4 == 0) {
			isLeapYear = true;
		}
		
		if (year % 100 == 0) {
			isLeapYear = false;
		}
		
		if (year % 400 == 0) {
			isLeapYear = true;
		}
		
		return isLeapYear;
	}
	
	private int getYear() {
		return year;
	}
	
	private int getMonth() {
		return month;
	}
	
	private int getDay() {
		return day;
	}
	
}
