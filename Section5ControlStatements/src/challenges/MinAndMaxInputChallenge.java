package challenges;

// 74. Min and Max Challenge

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// alternatively, set min and max values to +/- 2147483648 or use constants
		
		int min = 0; 	// int min = Integer.MIN_VALUE;	
		int max = 0;	// int min = Integer.MAX_VALUE;	
		
		int number = 0;
		boolean first = true;
		
		
		while(true) {  		
			
			System.out.print("Enter number: ");
		
		boolean hasNextInt = scanner.hasNextInt();	// check if input is a number
		
		if(hasNextInt) { 
			
			number = scanner.nextInt();
				
			// if only one numbered has been entered, make it the min and max
				if (first) {	
					min = number;
					max = number;
					first = false;
				}
				
			// compare values to update min and max
				if (number > min) {	
					max = number;
				}
				
				if (number < min) {
					min = number;
				}
			
		} else {
			System.out.println("Invalid input.");
			break;
		}
		
		scanner.nextLine();
	
	}
	
	scanner.close();
	
	System.out.println("Min: " + min);
	System.out.println("Max: " + max);
	}

}
