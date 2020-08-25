package codingexercises;

// Coding Exercise 15: Number Palindrome

public class NumberPalindrome {

	public static void main(String[] args) {

//		int number = -1001;
//		int reversed = 0;
//		
//		
//		while (Math.abs(number) > 0) {
//			
//			int lastDigit = number % 10;
//			System.out.println("Last Digit: " + lastDigit);
//			
//			int digit = number % 10;
//			System.out.println("Digit: " + digit);
//			
//			reversed += digit;
//			System.out.println("Reversed: " + reversed);
//			reversed *= 10;
//			
//			
//			number /= 10;
//			System.out.println("Number at End of Iteration: " + number);
//			System.out.println("---");
// }

		System.out.println(isPalindrome(-1221));
		System.out.println("******************");
		System.out.println(isPalindrome(707));
		System.out.println("******************");
		System.out.println(isPalindrome(11212));
	} // ends main

	public static boolean isPalindrome(int number) {
		
		int reversed = 0;
		
		// replica of original number to do calculations with and modify
		int doMath = number;  
		
		// use absolute value of number in case number passed is negative
		while (Math.abs(doMath) > 0) {   
			
			// get the last digit of the number by getting the remainder (in the ones place)
			int digit = doMath % 10;	
			System.out.println("Digit: " + digit);
			
			// add the previous number to reversed
			reversed += digit;	
			System.out.println("Reversed: " + reversed);
			
			// multiply the reversed number by 10
			reversed *= 10;
			
			// decrement the number passed by dividing 10
			doMath /= 10;
			System.out.println("Number at End of Iteration: " + doMath);
			System.out.println("Reversed at End of Iteration: " + reversed);
			System.out.println("---");
			
		}
		
		reversed /= 10;  // gets rid of last digit '0'
		
		System.out.println("Reversed: " + reversed + " | " + "Original Number: " + number);
		
		if (reversed == number) {
			return true;
		} else {
			return false;
		}
	}
}
