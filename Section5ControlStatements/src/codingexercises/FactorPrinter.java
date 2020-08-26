package codingexercises;

// Coding Exercise 21: All Factors

public class FactorPrinter {
	
	public static void main(String[] args) {
		
		System.out.println("Factors of 6: ");
		printFactors(6);
		System.out.println("***********");
		System.out.println("Factors of 32: ");
		printFactors(32);
		System.out.println("***********");
		System.out.println("Factors of 10: ");
		printFactors(10);
		System.out.println("***********");
		System.out.println("Factors of -1: ");
		printFactors(-1);
		
	}
	
	public static void printFactors(int number) {
		
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		
		for (int i = 1; i <= number; i++) {
			
			if(number % i == 0) {
				System.out.println(i);
			}
			
		}
		
	}

}
