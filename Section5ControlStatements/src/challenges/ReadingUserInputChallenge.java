package challenges;

import java.util.Scanner;

// 73. Reading User Input Challenge

public class ReadingUserInputChallenge {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 1;
		int sum = 0;
		
		while(true) {  		// alternatively, can put while counter < 11, and then comment out break statement
			
			System.out.print("Enter number #" + count + ": ");
			
			boolean hasNextInt = scanner.hasNextInt();
			
			if(hasNextInt) {
				int number = scanner.nextInt();
				sum+=number;
				count++;
				
				if (count == 11) {  // since count starts at 1, end at 11 for 10 digits
					break;
				}
			} else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine(); 
			
		}
		System.out.println("The sum is : " + sum);
		scanner.close();
	}

}
