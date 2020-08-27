package codingexercises;

// Coding Exercise 23: Number To Words

public class NumberToWords {

	public static void main(String[] args) {
			
		numberToWords(4321);
		System.out.println("**********");
		numberToWords(100);
		
//		System.out.println(getDigitCount(432));
//		System.out.println(getDigitCount(1001));
//		
//		numberToWords(0);
	}

	public static void numberToWords(int number) {
		
		int digitCount = getDigitCount(number);
		
		number = reverse(number);
		
		int revDigitCount = getDigitCount(number);
		
//		System.out.println("Starting Count: " + digitCount);
//		System.out.println("Reversed Count: " + revDigitCount);
		
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		
		if (number == 0) {
			System.out.println("Zero");
		}
		
				
		while (number > 0) {
			int lastDigit = number % 10;

			switch (lastDigit) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
			number /= 10;
//			System.out.println("Digit Count: " + getDigitCount(number));
		} // ends while loop
		
		// gets how many leading zeroes are missing when number is reversed
		// and prints them
		int zeroes = digitCount - revDigitCount;  
		for (int i = 0; i < zeroes; i++) {
			System.out.println("Zero");
		}
		
		

	} // ends numberToWords()
	
	public static int reverse(int number) {
		
		int reversed = 0;
		
		while (Math.abs(number) > 0) {
			
			int lastDigit = number % 10;
			reversed = (reversed + lastDigit) * 10;
			
			number /= 10;
			
		}
		
		return (reversed / 10);		
	} // ends reverse()
	
	public static int getDigitCount(int number) {
		
		if (number < 0 ) {
			return -1;
		}
		
		if (number == 0) {
			return 1;
		}
		
		int count = 0;
		
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
		
	} // ends getDigitCount

}
