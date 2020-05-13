package section4;

public class Methods {

	public static void main(String[] args) {	
				
		int highScore = calculateScore(true, 900, 5, 100);
		System.out.println("Final Score: " + highScore);
		
		boolean gameOver = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 300;
		
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Final Score: " + highScore);		
		
	} // ends main
	
	// old code 
//	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//				
//		if (gameOver) {
//			int finalScore = score + (levelCompleted  * bonus);
//			System.out.println("Final Score: " + finalScore);
//		}
//		
//	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if (gameOver) {
			int finalScore = score + (levelCompleted  * bonus);
			finalScore += 2000;
			return finalScore;
		} 
		return -1;	
		
	}

}
