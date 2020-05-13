package section3;

public class FloatsAndDoubles {
	
	public static void main(String[] args) {
		
		// double has larger range and is more 
		// accurate than the float
		
		float minFloatValue = Float.MIN_VALUE;
		float maxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Min: " + minFloatValue + 
				"\nFloat Max: " + maxFloatValue);
		
		double minDoubleValue = Double.MIN_VALUE;
		double maxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Min: " + minDoubleValue +
				"\nDouble Max: " + maxDoubleValue);
		
		int myIntValue = 5;
		
		// needs f at the end because by default,
		// a decimal is a double
		// use double more than float nowadays
		float myFloatValue = 5;
		float myFloatValue2 = (float) 5.25;
		
		double myDoubleValue = 5d;
		
		System.out.println("Int: " + myIntValue 
				+ "\nFloat: " + myFloatValue
				+ "\nDouble: " + myDoubleValue);
		
		// Challenge
		
		double pounds = 109;
		double kilo = 0.45359237;
		
		double conversion = pounds * kilo;
		System.out.println("Conversion: " + conversion);
		
		
		
		
		
		
		
		
		
	}

}
