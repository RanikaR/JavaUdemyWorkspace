package section3;

public class IfThenStatement {
	
	public static void main(String[] args) {
		
		boolean isAlien = false;
		
		if (isAlien == false) {
			System.out.println("It is not an alien.");
			System.out.println("I'm scared of aliens!");
			}
		
		int topScore = 80;
		System.out.println("Top Score: " + topScore);
		
		// comparison operators
		// ==, <, <= , >, >=
		
		if (topScore == 100) {
			System.out.println("You got the high score!");
		}
					
		int secTopScore = 60;
		
		// && needs both operands to be true
		if ( (topScore > secTopScore) && (topScore < 100) ) {
			System.out.println("Greater than second top score and less than 100");
		}
		
		// || logical or: needs at least one operand to be true
		if ( (topScore > 90) || (secTopScore <=90) ) {
			System.out.println("Either or both conditions are true.");
		}
		
		// Challenge
		
		int newValue = 50;
		
		// if (newValue = 50) --> wrong. 
		if (newValue == 50) {
			System.out.println("This is an error.");
		}
		
		boolean isCar = false;
		
		// if (isCar = true) --> wrong. assigns isCar to new, not compares.
		// shorthand: if (isCar) for true
		// if (!isCar) for false
		if (isCar == true) {
			System.out.println("This is not suppoed to happen");
		}
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
