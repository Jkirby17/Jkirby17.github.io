import java.util.Scanner;

/*
 * write two overloaded methods
 * return the average of an array
 * write test program
 * enter ten double values
 * invoke methods
 * display average value
 */
public class A7dot8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 whole numbers: ");
		double[] myList = new double[10];
		for (int i = 0; i < myList.length; i++)
			myList[i] = input.nextDouble();
		System.out.println("The average is: " + average(myList));
	}
	public static double average(double[]array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];			
		}
		return total /10;
	
	}
		
	
	


}
