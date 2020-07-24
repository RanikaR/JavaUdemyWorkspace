package codingexercises;

public class SecondsAndMinutes {

	// Introducing constants and final keyword
	private static final String INVALID_VALUE_MESSAGE ="Invalid value";
	
	public static void main(String[] args) {
		System.out.println(getDurationString(125, 15));
		System.out.println(getDurationString(56, 3));
		// checking invalid data
		System.out.println(getDurationString(-3, 15));
		System.out.println(getDurationString(40, -2));
		System.out.println(getDurationString(40, 73));
		

		System.out.println(getDurationString(615));
		// checking invalid data
		System.out.println(getDurationString(-615));
	}

	public static String getDurationString(int minutes, int seconds) {

		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			// return "Invalid value";
			return INVALID_VALUE_MESSAGE;
		}

		int hours = minutes / 60;
		int remainingMin = minutes % 60;
		
		// Bonus Challenge: Formatting leading zeros 
		String hoursString = hours + "h";
		if (hours < 10) {
			hoursString = "0" + hoursString;
		}
		
		String minString = remainingMin + "m";
		if (remainingMin < 10) {
			minString = "0" + minString;
		}
		
		String secString = seconds + "s";
		if (seconds < 10) {
			secString = "0" + secString;
		}
		
		return hoursString + " " + minString + " " + secString;
		
		// String result = (hours + "h " + remainingMin + "m " + seconds + "s");
		// return result;

		

	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			// return "Invalid value";
			return INVALID_VALUE_MESSAGE;
		}

		int thisMinutes = seconds / 60;
		int thisSeconds = seconds % 60;
		return getDurationString(thisMinutes, thisSeconds);

	}

}
