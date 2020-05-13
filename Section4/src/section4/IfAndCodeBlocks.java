package section4;

public class IfAndCodeBlocks {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 900;
		int levelCompleted = 5;
		int bonus = 100;
		
//		if ( score == 5000 ) {
//			System.out.println("You score was 5000.");
//		} else if (score < 1000) {
//			System.out.println("You score was less than 1000");
//		} else {
//			System.out.println("Your score is not 5000.");
//		}
		
		if (gameOver == true) {
			int finalScore = score + (levelCompleted  * bonus);
			System.out.println("Final Score: " + finalScore);
		}
		
		// can't be accessed outside of code block
//		int savedFinalScore = finalScore;
		
		
		// Challenge
		
		score =10000;
		levelCompleted = 8;
		bonus = 200;
		
		int finalScore = score + (levelCompleted  * bonus);
		System.out.println("Final Score: " + finalScore);
		
		

	}

}
