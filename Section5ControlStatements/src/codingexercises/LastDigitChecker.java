package codingexercises;

// Coding Exercise 19: Last Digit Checker

public class LastDigitChecker {
	
	public static void main(String[] args) {
		
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
		System.out.println(hasSameLastDigit(1000, 40, 311));
		System.out.println(hasSameLastDigit(3421, 40, 311));
		
		System.out.println("*********************");
		
		System.out.println(isValid(10));
		System.out.println(isValid(468));
		System.out.println(isValid(1051));
		System.out.println(isValid(1000));
	}
	
	public static boolean hasSameLastDigit(int x, int y, int z) {
		
		// number range 10 - 1000 inclusive
		
		
		// without isValid:
		// if ( x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) 
		if ( !isValid(x) || !isValid(y) || !isValid(z) ) {   
			return false;
		} else {
		
		int xDigit = x % 10;
		int yDigit = y % 10;
		int zDigit = z % 10;
		
		return ( (xDigit == yDigit) || (xDigit == zDigit) || (yDigit == zDigit) );
		
		}
	}
	
	public static boolean isValid(int num) {
		// number range 10 - 1000 inclusive
		
		if ( num > 9 && num < 1001) {
			return true;
		} else {
			return false;
		}
	}

}
