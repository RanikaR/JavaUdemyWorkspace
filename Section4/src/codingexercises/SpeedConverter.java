package codingexercises;

public class SpeedConverter {
	
	/* Write a method toMilesPerHour that has parameter 
	 * double kilometersPerHour. Return rounded value of calculation
	 * as type long. If kph is less than 0, return -1. If positive,
	 * calculate mph and round it and return it.
	 * 1 mph = 1.609 kph
	 */
	
	public static void main(String[] args) {
		
		toMilesPerHour(85.00);
		System.out.println(toMilesPerHour(70.00));
		
		printConversion(70.00);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			return -1;
		} else {
//			double conversion = (1/1.609) * kilometersPerHour;
//			long rounded = Math.round(conversion);
//			return rounded;
			long milesPerHour = Math.round(kilometersPerHour/1.609);
			return milesPerHour;
		}
		
	}
	
	public static void printConversion(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
		System.out.println(kilometersPerHour + " km/h = " + 
				toMilesPerHour(kilometersPerHour) + " mi/h");
		}
	}
	
}
