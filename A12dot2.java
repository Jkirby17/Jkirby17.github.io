//create boolean
//Prompt the user to enter two integers
// Display the result
// Discard input
import java.util.InputMismatchException;
import java.util.Scanner;

public class A12dot2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try { 		System.out.print("Enter two numbers: ");

			int number1 = input.nextInt();
			int number2 = input.nextInt();

			System.out.println("The sum is " + (number1 + number2));
			continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: two integers are required) ");
				input.nextLine(); 
			}
		} while (continueInput);
	}

}
