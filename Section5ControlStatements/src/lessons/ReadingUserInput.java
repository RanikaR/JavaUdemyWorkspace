package lessons;

// 71. Reading User Input
// 72. Problems and Solutions

import java.util.Scanner;

public class ReadingUserInput {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth: ");
		
		boolean hasNextInt = scanner.hasNextInt();
		if(hasNextInt) {
			int year = scanner.nextInt();
			scanner.nextLine();  // handle next line character (enter key)
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			int age = 2020 - year;
			
			if (age >= 0 && age <= 120) {
				System.out.println("Hello, " + name + ". You are " + age + " years old.");
			} else {
				System.out.println("You have entered an invalid year of birth.");
			}
		} else {
			System.out.println("Unable to parse year of birth.");
		}
		
		scanner.close();
	}

}
