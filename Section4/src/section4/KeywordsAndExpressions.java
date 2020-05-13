package section4;

public class KeywordsAndExpressions {
	
	public static void main(String[] args) {
		
		// reserved words in java
		// int
		// false, true, null
		// .. and more ..
		
		// a mile is equal to 1.609344 kilometers
		double kilometers = (100 * 1.609344);
		
		int highScore = 50;
		if ( highScore == 50 ) {
			System.out.println("This is an expression.");
		}
		
		
		// Challenge: which lines are expressions
		
		int score = 100; // score = 100
		if ( score > 99 ) {  // score > 99
			System.out.println("You got the high score");  // "You got the high score"
			score = 0;  // score = 0
		}
		
	}

}
