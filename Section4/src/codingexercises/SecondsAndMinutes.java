package codingexercises;

public class SecondsAndMinutes {

	public static void main(String[] args) {
		System.out.println(getDurationString(125, 15));
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
			return "Invalid value";
		}

		int hours = minutes / 60;
		int remainingMin = minutes % 60;
		
		String result = (hours + "h " + remainingMin + "m " + seconds + "s");
		return result;

		

	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid value";
		}

		int thisMinutes = seconds / 60;
		int thisSeconds = seconds % 60;
		return getDurationString(thisMinutes, thisSeconds);

	}

}
