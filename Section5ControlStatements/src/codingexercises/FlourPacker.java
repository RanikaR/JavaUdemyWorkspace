package codingexercises;

// Coding Exercise 24: Flour Pack Problem

public class FlourPacker {

	public static void main(String[] args) {

		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
		System.out.println(canPack(2, 2, 11));
		System.out.println(canPack(-3, 2, 12));
		System.out.println(canPack(1, 0, 6));
		System.out.println(canPack(2, 1, 5));

	}

	// big = 5 kilos
	// small = 1 kilo

	// return true if goal amount can be reached using provided full big and/or
	// small flour bags. leftovers okay.

	 public static boolean canPack(int bigCount, int smallCount, int goal) {
		 
		 int totalBigCount = bigCount * 5;
		 
		 	// validates input
	        if (bigCount < 0 || smallCount < 0 || goal < 0) {
	            return false;
	        
	        // does using all bags not reach goal
	        } else if ( totalBigCount + smallCount < goal) {
	            return false;
	        
	        // does having only big bags exceed goal
	        } else if ( (totalBigCount > goal) && (smallCount == 0) ) {
	            return false;
	        
	        // case where there's not enough small bags to use to get to the goal 
	        // even if there's big bags to use
	        } else if ( (totalBigCount > goal) && (goal % 5 > smallCount) ){
	            return false;
	            
	        } else {
	            return true;
	        }
	    } 

}
