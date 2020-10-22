package codingexercises;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		int count = 1;

		long average = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			// System.out.print("Enter number: ");

			boolean hasNextInt = scanner.hasNextInt();

			if (hasNextInt) {
				int number = scanner.nextInt();
				sum += number;
				average = Math.round((double) sum / (double) count);
				count++;
				

			} else {
				break;
			}
			scanner.nextLine();

		}

		System.out.println("SUM = " + sum + " AVG = " + average);
		scanner.close();

	}

}
