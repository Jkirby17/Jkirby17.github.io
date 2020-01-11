// Create a Scanner
// Number of years to display
// Prompt the user to enter the investment amount and interest rate
// Get monthly interest rate
// Print a table that displays future value for the years from 1 to 30
// Method futureInvestmentValue computes future investment value
import java.util.Scanner;
public class A6dot7 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
			final int NumberOfYears = 30; 

			
			System.out.print("\nThe amount invested: ");
			double amount = input.nextDouble();
			System.out.print("Annual interest rate: ");
			double annualInterestRate = input.nextDouble();

			double monthlyInterestRate = annualInterestRate / 1200;

			System.out.println("Years     Future Value"); // Table header
			for (int years = 1; years <= NumberOfYears; years++) {
				System.out.printf("%-10d", years);
				System.out.printf("%11.2f\n", 
					futureInvestmentValue(amount, monthlyInterestRate, years));
			}
		}

		
		public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, int years) {
			return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		}
	}