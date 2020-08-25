package challenges;

// 66. Sum 3 and 5 Challenge

// Create a for statement using a range of numbers from 1 to 1000 inclusive
// Sum all the numbers that can be divided with both 3 and 5
// For those numbers that meet the above conditions, print out the number
// Break out of the loop once you find 5 numbers that met the above conditions
// After breaking of the loop, print the sum of the numbers that met the above conditions

public class Sum3And5 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i < 10001; i++) {
			if( ( i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i);
				count++;
				sum = sum + i;   // or sum += i
				if(count == 5) {
					System.out.println("Total sum: " + sum);
					break;
				}
			}
		}
		

	}

}
