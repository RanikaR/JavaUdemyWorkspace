package challenges;


// 69. Digit Sum Challenge

public class DigitalSum {
	
	public static void main(String[] args) {
		
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(9));
		System.out.println(sumDigits(10));
		System.out.println(sumDigits(32123));
	}
	
	public static int sumDigits(int number) {
		
		if (number < 10) {
			return -1;
		}
		
		int sum = 0;
		
		while (number > 0) {
			
			// get least significant digit
			int digit = number % 10;
			sum += digit;
			
			number /= 10;  // decrement by dividing 10. 
		}
		return sum;
		
	}

}
