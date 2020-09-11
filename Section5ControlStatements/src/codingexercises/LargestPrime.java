package codingexercises;

// Coding Exercise 25: Largest Prime

public class LargestPrime {

	public static void main(String[] args) {
		
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-21));

	}
	
	public static int getLargestPrime(int number) {
		
		if (number <= 1) {
			return -1;
		}
		
		// Find Factors by starting with largest and going to smallest
		for (int i = (number/2); i > 1; i-- ) {
			
			if (number % i == 0 ) {
				
				// Check if current Factor is Prime
				if (number % i == 0) {
					
					// Make number equal to current iteration and repeat process
					number = i;
				}
			}
		}
		return number;
	}
	
//	public static boolean isPrime(int n) {
//		if (n == 1) {
//			return false;
//		}
//		
//		for(int i = 2; i <= n/2; i++) {   // Optimized: for(int i = 2; i <= (long) Math.sqrt(n); i++)
//			if(n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	public static void printFactors(int number) {
//		
//		if (number < 1) {
//			System.out.println("Invalid Value");
//		}
//		
//		for (int i = 1; i <= number; i++) {
//			
//			if(number % i == 0) {
//				System.out.println(i);
//			}
//			
//		}
//		
//	}

}
