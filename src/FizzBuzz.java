import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
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
			if(i % 3 == 0)														// Check for multiple of 3
				System.out.print("Fizz");
			if(i % 5 == 0)														// Check for multiple of 5
				System.out.print("Buzz");
			if(i % 3 != 0 && i % 5 != 0)										// Print a number by default
				System.out.print(i);
			System.out.println();												// New line
		}
		
		System.out.println("That was fun!");									// Program end
	}
}
