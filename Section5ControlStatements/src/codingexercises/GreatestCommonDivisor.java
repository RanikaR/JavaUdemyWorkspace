package codingexercises;

// Coding Exercise 20: Greatest Common Divisor

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));

	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		
		if( (first < 10) || (second < 10) ) {
			return -1;
		}
		
		int minimum = 0;
		
		// Find which number is smallest
		if(first < second) {
			minimum = first;
		} else {
			minimum = second;
		}
		
		// stores greatest common denominator
		int gcd = 0;
		
		// i is the test number that first and second gets divided by
		// i starts at 1, increments by 1, and stops at the minimum value 
		for(int i = 1; i <= minimum; i++) {
			
			if( (first % i == 0) && (second % i == 0) ) {
				
				gcd = i;
			}
		}
		
		return gcd;
		
	}

}
