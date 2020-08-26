package codingexercises;

// Coding Exercise 18: Shared Digit

public class SharedDigit {

	public static void main(String[] args) {
		
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
		System.out.println(hasSharedDigit(12, 13));

	}
	
	public static boolean hasSharedDigit(int num1, int num2) {
		
		// a - 10s spot. b - 1s spot.
		int num1a = num1 / 10;
		int num1b = num1 % 10;
		
		int num2a = num2 / 10;
		int num2b = num2 % 10;
		
		if( (num1 < 10) || (num2 < 10) || (num1 > 99) || (num2 > 99) ) {
			return false;
		} 
		
		return ( (num1a == num2a) || (num1a == num2b) ||
				(num1b == num2a) || (num1b == num2b) );
		
	}

}
