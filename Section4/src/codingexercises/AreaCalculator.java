package codingexercises;

public class AreaCalculator {
	
	public static void main(String[] args) {
		System.out.println(area(-1));     		// -1
		System.out.println(area(5.0)); 			// 78.53875
		System.out.println(area(5.0, 4.0));		// 20.00
		System.out.println(area(-1.0, 4.0));	// -1
	}
	
	// Calculates area of a circle
	public static double area(double radius) {
		double result = 0.0;
		
		if (radius < 0) {
			return -1.0;
		} else {
			result = radius * radius * Math.PI;
			return result;
		}
		
	}
	
	// Calculates area of a rectangle
	public static double area(double x, double y) {
		double result = 0.0; 
		
		if ( (x < 0) || (y < 0) ) {
			return -1;
		} else {
			result = x * y;
			return result;
		}
	}

}
