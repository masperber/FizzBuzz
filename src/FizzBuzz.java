import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		final int FIZZ = 3;														// Create final variables
		final int BUZZ = 5;
//		final int FUZZ = 7;														// Future use
		
		Scanner scan = new Scanner(System.in); 									// Instantiate Scanner
		System.out.print("Welcome to FizzBuzz! How high should we count? ");	// Prompt for input
		int number = 0;															// Initialize variable
		
		while (!scan.hasNextInt()) {											// Input validation
			System.out.print("Please enter an integer! ");
			scan.next();
		}
		
		number = scan.nextInt();												// Set number
		scan.close();															// Close Scanner
		
		for (int i = 1; i <= number; i++) {										// Start counting at 1
			String output = "";
			if(i % FIZZ == 0)													// Check for Fizz
				output += "Fizz";
			if(i % BUZZ == 0)													// Check for Buzz
				output += "Buzz";
//			if(i % FUZZ == 0)													// Check for Fuzz (future use)
//				output += "Fuzz";
			if(output.isEmpty())												// Print a number by default
				output = String.valueOf(i);
			System.out.println(output);											// New line
		}
		
		System.out.println("That was fun!");									// Program end
	}
}
