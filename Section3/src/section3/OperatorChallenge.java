package section3;

public class OperatorChallenge {
	
	public static void main(String[] args) {
			
	// my solution
	double firstNum = 20.00;
	double secondNum = 80.00;
	
	double total = (firstNum + secondNum) * 100;
	System.out.println("Total: " + total);
	
	double remainder = total % 40.00;
	System.out.println("Total % 40.00 = " + remainder);
	
	boolean isRemainderZero = (total % 40.00 == 0) ? true : false;
	
	System.out.println("isRemainderZero: " + isRemainderZero);
	
	if (!isRemainderZero) {
		System.out.println("Got some remainder.");
	}
	
	System.out.println("******************");
	
	// tim's solution
	double myFirst = 20.00d;
	double mySecond = 80.00d;
	
	// because there's no parentheses, 80 * 100 occurs first
	double myValuesTotal = myFirst + mySecond * 100;
	System.out.println("My Value: " + myValuesTotal);
	
	double myRemainder = myValuesTotal % 40.00d;
	System.out.println("Remainder: " + myRemainder);
	
	boolean isNoRemainder = (myRemainder == 0) ? true : false;
	System.out.println("isNoRemainder: " + isNoRemainder);
	
	if(!isNoRemainder) {
		System.out.println("Got some remainder");
	}
	
	
	
	
	}
	

}
