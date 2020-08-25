package lessons;

// 64. The for Statement (+Challenge Exercise)

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * for(init; condition for termination; increment aka iterator, iteration step) { // code block }
		 * 
		 * for(int i = 0; i < 5; i++) { // code block }
		 * 
		 */

		for (int i = 0; i < 5; i++) {
			System.out.println("Loop " + i);
		}

		// Using the for statement, call the calculateInterest method with the amount of
		// 10,000 with an interestRate of 2-8 and print the results to the console window

		for (int j = 2; j < 9; j++) {

			System.out.println("10,000 at " + j + "% interest = " 
							+ String.format("%.2f", calculateInterest(10000.0, j)));
		}

		// Modify loop to start from 8% to 2%
		for (int k = 8; k > 1; k--) {

			System.out.println("10,000 at " + k + "% interest = " 
					+ String.format("%.2f", calculateInterest(10000.0, k)));
		}
		
		// Create a for statement using any range of numbers
		// Determine if the number is a prime number using the isPrime method
		// If it is a prime, print it out and increment a count of the number of primes n=found
		// If the count is 3, exit the for loop
		
		int count = 0;
		for(int i = 10; i < 50; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println(i);
				if(count == 3) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		

	} // ends main

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for(int i = 2; i <= n/2; i++) {   // Optimized: for(int i = 2; i <= (long) Math.sqrt(n); i++)
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	

}
