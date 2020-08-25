package lessons;

// 67. The while and do while statements (+Challenge Exercise)

// Continue - loop will bypass the part of the code block that is below the continue keyword and 
// move to the next iteration

// Break - exit the loop 

public class WhileAndDoWhile {
	
	public static void main(String[] args) {
		
		int count = 0;
		while(count != 5) {
			System.out.println("Count value is " + count);
			count++;
		}
		
		System.out.println("----------------------");
		
//		count = 1;
//		while(true) {
//			if(count == 5) {
//				break;
//			}
//			System.out.println("Count value is " + count);
//			count++;
//		}
		
		
		// do while executes at least once
		count = 1;
		do {
			System.out.println("Count value was " + count);
			count++;
		} while (count != 6);
		
		System.out.println("----------------------");
		
		System.out.println(isEvenNumber(1));
		System.out.println(isEvenNumber(4));
		System.out.println(isEvenNumber(-3));
		System.out.println(isEvenNumber(-6));
		
		System.out.println("----------------------");
		
		// Using isEvenNumber() in while loop
		int num = 4;
		int finishNum = 20;
		
		while (num < finishNum) {
			num++; // skips 4, goes immediately to 5
			if(!isEvenNumber(num)) {
				continue;
			} 
			
			System.out.println("Even number: " + num);
			
		}
		
		// Modify code above to record the total number of even numbers found
		// Break once 5 are found, then display the count
		
		System.out.println("----------------------");
		
		num = 4;
		finishNum = 20;
		int counter = 0;
		
		while (num < finishNum) {
			num++; // skips 4, goes immediately to 5
			if(!isEvenNumber(num)) {
				counter++;
				continue;
			} 
			
			System.out.println("Even number: " + num);	
			
			if(counter == 5) {
				System.out.println("Found " + counter + " even numbers");
				break;
			}
		}
		
		
	} // ends main
	
	// Create a method called isEvenNumber that takes an int parameter
	// Determine if number is even or not. Return true if even, otherwise return false
	
	public static boolean isEvenNumber(int num) {
		
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	

}
