package codingexercises;

public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if (hourOfDay < 0) {
			return false;
		} else if (hourOfDay > 23) {
			return false;
		} else if (hourOfDay < 8 && isBarking) {
			return true;
		} else if (hourOfDay > 22 && isBarking) {
			return true;
		} else {
			return false;
		}
			
	}
	
	public static void main(String[] args) {
		
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(false, 2));
		System.out.println(shouldWakeUp(true, 8));
		System.out.println(shouldWakeUp(true, -1));
	}
}