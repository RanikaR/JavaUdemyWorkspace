package codingexercises;

public class NumberToWords {

	public static void main(String[] args) {
		
		System.out.println(reverse(432));
		numberToWords(432);
		
		System.out.println(reverse(100));
		numberToWords(100);
	}

	public static void numberToWords(int number) {

		number = reverse(number);
		
		if (number < 1) {
			System.out.println("Invalid Value");
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
		}

	} // ends numberToWords
	
	public static int reverse(int numToReverse) {
		
		int reversed = 0;
		
		while (numToReverse > 0) {
			
			int lastDigit = numToReverse % 10;
			reversed = (reversed + lastDigit) * 10;
			
			numToReverse /= 10;
			
		}
		
		return (reversed / 10);
		
		
		
	}

}
