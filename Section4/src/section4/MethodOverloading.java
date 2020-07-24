package section4;

public class MethodOverloading {

	public static void main(String[] args) {
	
		int newScore = calculateScore("Ranika", 500);
		System.out.println("New score is " + newScore);
		
		System.out.println(calculateScore(75));

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	// Changed parameters, but kept same name
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	// Need to create unique method signature to overload methods.
	public static int calculateScore(int score, int score2) {
		System.out.println("First score: " + score + " | Second Score: " + score2 );
		return score * 1000;
	}


}
