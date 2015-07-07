package week1;

/**
 * 2015년 2학기 Programming In Java 1주차 과제
 * BirthDay Test Class
 * 
 * @author 윤영기
 * @date 2015.7.7
 * @version 1.0
 */

public class TestBirthDay {

	public static void main(String[] args) {
		boolean isValidDate = false;
		
		BirthDay birthDay;
		birthDay = new BirthDay(2000, 2, 29);
		
		isValidDate = birthDay.isValidDate(birthDay);
		printResult(isValidDate);
		
		birthDay = new BirthDay(2014, 7, 10);
		
		isValidDate = birthDay.isValidDate(birthDay);
		printResult(isValidDate);

		birthDay = new BirthDay(2100, 2, 29);
		
		isValidDate = birthDay.isValidDate(birthDay);
		printResult(isValidDate);
	}
	
	private static void printResult(boolean isValidDate) {
		if (isValidDate == true) {
			System.out.println("유효한 날짜입니다!");
		} else {
			System.out.println("유효하지 않은 날짜입니다!");
		}
	}

}
