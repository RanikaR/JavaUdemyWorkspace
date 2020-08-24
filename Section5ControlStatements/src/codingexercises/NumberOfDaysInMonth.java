package codingexercises;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));

		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));
		System.out.println(getDaysInMonth(5, 10000));
	}

	// From LeapYearCalculator.java in Section4 package
	public static boolean isLeapYear(int year) {
		if ((year < 1) || (year > 9999)) {
			return false;
			// first part - check for years not ending in 00.
			// if divisible by 4, is a leap year
		} else if ((year % 4 == 0) && (year % 100 != 0) ||
		// second part - check for years ending in 00.
		// if divisible by both 100 and 400, is a leap year
				((year % 100 == 0) && (year % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}

	public static int getDaysInMonth(int month, int year) {

		if (year < 1 || year > 9999 || month < 1 || month > 12) {
			return -1;
		} else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if (isLeapYear(year))
					return 29;
				else
					return 28;
			default:
				return -1;

			}
		}

	}

}
