package codingexercises;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

//		firstNum = firstNum * 1000;
//		int result1 = (int) firstNum;
//		firstNum = (double) result1 / 1000;
//		
//		secondNum = secondNum * 1000;
//		int result2 = (int) secondNum;
//		secondNum = (double) result2 / 1000;
		
//		System.out.println(firstNum + " " + secondNum);
//		
//		if (firstNum == secondNum) {
//			return true;
//		} else {
//			return false;
//		}
		
		 firstNum = (int)(firstNum * 1000);
	     secondNum = (int)(secondNum * 1000);
	     
	     System.out.println(firstNum + " " + secondNum);
	     
	     return firstNum == secondNum;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
		
		
	}

}
