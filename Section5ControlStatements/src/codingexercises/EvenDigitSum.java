package codingexercises;

// Coding Exercise 17: Even Digit Sum

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		System.out.println(getEvenDigitSum(66));
		System.out.println(getEvenDigitSum(91));
		System.out.println(getEvenDigitSum(43));

	}

	public static int getEvenDigitSum(int number) {

		int sum = 0;

		if (number < 0) {
			return -1;
		} else {

			while (number > 0) {

				int digit = number % 10;
				number /= 10;

				if (digit % 2 == 0) {	// checks if digit is even and adds it to the sum
					sum += digit;
				}
			}
			return sum;
		}

	}
}
