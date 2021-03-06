package section4;

public class MethodOverloadingChallenge {
	
	public static void main(String[] args) {
		
		calcFeetInchesToCentimeters(7, 5);
		calcFeetInchesToCentimeters(0, 0);
		calcFeetInchesToCentimeters(0, 2);
		calcFeetInchesToCentimeters(0, 14);
		calcFeetInchesToCentimeters(0, -12);
		
		calcFeetInchesToCentimeters(100);
		calcFeetInchesToCentimeters(157);
		calcFeetInchesToCentimeters(-12);
		
	}
	
	public static double calcFeetInchesToCentimeters(double feet, double inches) {
		
		double result = 0;
		if (feet == 0 ) {
			if (inches >=0 && inches <=12) {
				result = (inches * 2.54);
				System.out.println(inches + " inches is " + result + " centimeters.");
				return result;
				
			} else {
				System.out.println("Please enter valid numbers. Inches cannot be greater than 12.");
			}
			
		} else if (feet >= 0 && inches <=12) {
			result = ( (feet * 12) + (inches) ) * 2.54;
			System.out.println(feet + " feet and " + inches + " inches is equal to " + result + " centimeters.");
			return result;
		}
		return result;
		
		// conditionals can be condensed to one line
//		if ((feet <0) || ((inches <0) || (inches >12))) {
//			System.out.println("Invalid input. Feet must be greater than 0 and inches between 0-12.");
//			return -1;
//			
//		}
//		
//		double centimeters = (feet * 12) * 2.54;
//		centimeters += inches * 2.54;
//		System.out.println(feet + " feet and " + inches + " inches is equal to " + centimeters + " centimeters.");		
//		return centimeters;
//		
	}
	
	public static double calcFeetInchesToCentimeters(double inches) {
//		double centimeters = 0;
//		
//		if (inches >= 0) {
//			centimeters = inches * 2.54;
//			System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");		
//		} else {
//			System.out.println("Please enter valid numbers.");
//		}
//		
//		return centimeters;
		
		if (inches < 0) {
			System.out.println("Invalid input.");
			return -1;
		}
		
		double feet = (int) inches /12;
		double remainingInches =(int) inches % 12;
		
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
		return calcFeetInchesToCentimeters(feet, remainingInches);
	}

}
