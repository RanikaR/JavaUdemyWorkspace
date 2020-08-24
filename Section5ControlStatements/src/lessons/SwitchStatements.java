package lessons;

// 62. The switch statement (+Challenge Exercise)

public class SwitchStatements {

	public static void main(String[] args) {
		
		// instead of using if/else statements
				
		int switchValue = 1;
		
		switch(switchValue) {
			case 1: 
				System.out.println("Value is 1");
				break;
			
			case 2:
				System.out.println("Value is 2");
				break;
				
			// shorthand
			case 3:case 4:case 5:
				System.out.println("Value is " + switchValue);
			
			default:
				System.out.println("Value not 1 or 2.");
		}
			
			// If/Else vs Switch
			// If/Else - More flexible criteria
			// Switch - Testing different values for a variable.
			//	Only works with byte, short, char, and int primitive types,
			// enums, String, wrapper classes Byte, Short, Character, and Integer
			
			
			// Create a new switch statement using char instead of int
			// Testing for A-E. Display a message if any of these values
			// are found, then break. Add defulat which displays a message
			// saying not found.
			
			char letter = 'A';
			
			switch(letter) {
			case 'A':case 'B':case 'C':case 'D':case 'E':
				System.out.println("Found: " + letter);
				break;
			
			default:
				System.out.println("Letters A - E not found.");
		}
			
			// With Strings
			String month = "January";
			// Case-sensitive. Use .toLowerCase() or .toUpperCase()
			
			switch(month) {  
			case "January":
				System.out.println("Jan");
				break;
			
			case "August":
				System.out.println("Aug");
				break;
			
			default:
				System.out.println("Don't know");
			}
		}
	}
	

