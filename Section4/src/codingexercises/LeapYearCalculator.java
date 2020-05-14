package codingexercises;

public class LeapYearCalculator {
	
	public static boolean isLeapYear(int year) {
		if ((year < 1) || (year > 9999)) {
			return false;	      
		// first part - check for years not ending in 00. 
		// if divisible by 4, is a leap year
		} else if ( (year % 4 == 0) && (year % 100 != 0) || 
				//  second part - check for years ending in 00. 
				// if divisible by both 100 and 400, is a leap year
				((year % 100 == 0) && (year % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(isLeapYear(-1600)); // false
		System.out.println(isLeapYear(1600)); // true
		System.out.println(isLeapYear(2017)); // false
		System.out.println(isLeapYear(2000)); // true
		System.out.println(isLeapYear(1924)); // true
		System.out.println(isLeapYear(1800)); // false
	}

}
