package section3;

public class TernaryOp {
	
	public static void main(String[] args) {
	
	boolean isCar = false;
	
	isCar = true;
	boolean wasCar = isCar ? true : false;
	
	if (wasCar) {
		System.out.println("wasCar is true");
	}
	
	int age = 20;
	
	boolean isOverEighteen = (age == 20) ? true : false;
	
	System.out.println(isOverEighteen);
	
	}

}
