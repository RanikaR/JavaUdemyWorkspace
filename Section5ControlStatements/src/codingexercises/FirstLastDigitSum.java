package codingexercises;

// Coding Exercise 16: First And Last Digit Sum

public class FirstLastDigitSum {

	public static void main(String[] args) {
		
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
		System.out.println(sumFirstAndLastDigit(49));
		System.out.println(sumFirstAndLastDigit(9006));

	}
	
	public static int sumFirstAndLastDigit(int number) {
		
		int first = 0;
		int last = number % 10;
		
		if(number < 0) {
			return -1;
		} else {
			while(number > 0) {
				first = number % 10;  // get end digit by getting remainder
				number /= 10;   	 // decrement place until number is a single digit
			}
			
			return first + last;	// returns the sum
		}
		
		
		
	}

}
