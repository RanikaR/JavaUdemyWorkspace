package lessons;

// 70. Parsing Values from a String

public class ParsingValuesFromString {
	
	public static void main(String[] args) {
		
		String numberAsString = "2018";
		
		System.out.println("Number as String = " + numberAsString);
		
		// converting String to Integer
		int number = Integer.parseInt(numberAsString);
		System.out.println("Number = " + number);
		
		// Doubles
		double doubleNumber = Double.parseDouble(numberAsString);
		System.out.println("Double Number = " + doubleNumber);
		
		numberAsString += 1;
		number += 1;
		doubleNumber += 1;
		
		System.out.println("*** After incrementing ***");
		System.out.println("Number as String = " + numberAsString);
		System.out.println("Number = " + number);
		System.out.println("DoubleNumber = " + doubleNumber);
		
		
		
	}
	
}

