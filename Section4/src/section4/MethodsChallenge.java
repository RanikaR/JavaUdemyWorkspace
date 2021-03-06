package section4;

public class MethodsChallenge {

	public static void main(String[] args) {	
		
//		int highScore = calculateScore(true, 900, 5, 100);
//		System.out.println("Final Score: " + highScore);
//		
//		boolean gameOver = true;
//		int score = 10000;
//		int levelCompleted = 8;
//		int bonus = 300;
//		
//		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//		System.out.println("Final Score: " + highScore);
		
		// Challenge
		// Create displayHighScorePosition with parameters of
		// players name and position on high score table.
		// Display name with message "managed to get x position"
		
		// Create method calculateHighScorePosition
		// sent one argument only -- the player score
		// return an int
		// return data should be:
		// 1 if score is >1000
		// 2 if sore is >500 and <1000
		// 3 if score is >100 and <500
		// call both methods to display results of the following:
		// 1500, 900, 400, and 50.
		
		// 1500 
		boolean gameOver = true;
		int score = 1500;
		int levelCompleted = 0;
		int bonus = 0;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(highScore);
		int playerPosition = calculateHighScorePosition(highScore);
		displayHighScorePosition("Player 1", playerPosition);
		
		
		// 900
		System.out.println("900");
		playerPosition = calculateHighScorePosition(900);
		displayHighScorePosition("Player 2", playerPosition);
		
		// 400
		System.out.println("400");
		playerPosition = calculateHighScorePosition(400);
		displayHighScorePosition("Player 3", playerPosition);;
		
		// 50
		System.out.println("50");
		playerPosition = calculateHighScorePosition(50);
		displayHighScorePosition("Player 4", playerPosition);
		
	} // ends main
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if (gameOver) {
			int finalScore = score + (levelCompleted  * bonus);
			return finalScore;
		} 
		return -1;		
	}
	
	public static int calculateHighScorePosition (int highScore) {
		
//		if (highScore >= 1000) {
//			return 1;
//		} else if (highScore >= 500) {
//			return 2;
//		} else if (highScore >= 100) {
//			return 3;
//		} else {
//			return -1;
//		}
		
		// code with less return statements
		int playerPosition = -1;
		
		if (highScore >= 1000) {
			playerPosition = 1;
		} else if (highScore >= 500) {
			playerPosition = 2;
		}  else if (highScore >= 100) {
			playerPosition = 3;
		}
		
		return playerPosition;
		
	}
	
	public static void displayHighScorePosition(String playerName, int playerPosition) {
		if (playerPosition > 0 ) {
		System.out.println(playerName + " placed in position #" + playerPosition + "\n"); 
		} else {
			System.out.println(playerName + " did not place in rankings. \n" );
		}
		
	}

}
