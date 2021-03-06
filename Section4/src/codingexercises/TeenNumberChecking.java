package codingexercises;

public class TeenNumberChecking {
	
	public static boolean hasTeen(int age1, int age2, int age3) {
		
//		if ( (age1 >=13 && age1 <=19) || (age2 >=13 && age2 <=19) || (age3 >=13 && age3 <=19) ) {
//			return true;
//		} else {
//			return false;
//		}
		
		return ( (age1 >=13 && age1 <=19) || (age2 >=13 && age2 <=19) || (age3 >=13 && age3 <=19) );
	}
	
	public static boolean isTeen(int age) {
		return (age > 12 && age < 20);
	}

	public static void main(String[] args) {
		
		System.out.println(hasTeen(0, 0, 20)); // false
		System.out.println(hasTeen(0, 0, 12)); // false
		System.out.println(hasTeen(9, 99, 19)); // true
		System.out.println(hasTeen(23, 15, 42)); // true
		System.out.println(hasTeen(22, 23, 34)); // false
				
		System.out.println(isTeen(9)); // false
		System.out.println(isTeen(13)); // true
		System.out.println(isTeen(12)); // false

	}

}
