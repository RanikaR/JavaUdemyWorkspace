package codingexercises;

public class MinutesToYearsDaysCalculator {
	
	public static void main(String[] args) {
		printYearsAndDays(525600); 		// 1 yr, 0 d
		printYearsAndDays(1051200); 	// 2 yr, 0 d
		printYearsAndDays(561600); 		// 1 yr, 25 d
		
	}
	
	public static void printYearsAndDays(long minutes) {
		
		if (minutes < 0) {
			 System.out.println("Invalid Value");
		} else {
			// 60 min * 24 hrs * 365 days = minutes in a year
			long years = minutes / (60 * 24 * 365);
			long days = ( minutes % (60 * 24 * 365) / (60*24)) ;
 			
			System.out.println(minutes + " min = " + years + " y and " + days +" d");
		}
	}

}
