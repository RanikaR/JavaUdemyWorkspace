package codingexercises;

public class PositiveNegativeZero {
	
	// Write a method called checkNumber with int parameter number
	// method should not return any value
	// needs to print out:
	// "positive" if parameter num is > 0
	// "negative" if num < 0
	// "zero" if num = 0
	
	public static void main(String[] args) {
		
		checkNumber(125);
		checkNumber(0);
		checkNumber(-4);
		
	}
	
	public static void checkNumber(int num) {
		
		if (num > 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		
	}

}
