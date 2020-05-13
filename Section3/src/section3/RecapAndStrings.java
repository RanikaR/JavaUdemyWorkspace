package section3;

public class RecapAndStrings {
	
	public static void main(String[] args) {
		
		// 8 primitive data types:
		// byte, short, int, long, float, double, char, boolean
		
		String str = "This is a string";
		System.out.println(str);
		str = str + " and this is more";
		System.out.println(str);
		
		String num = "250.55";
		num = num + "45.95";
		// does not add as math, but appends together
		System.out.println(num);
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		// this does add because there is at least one int
		System.out.println(lastString);
		
		double doub = 120.47d;
		System.out.println(doub + lastString);
		
		
		
	}

}
