import java.util.Scanner;

/*
 * write two overloaded methods
 * return the average of an array
 * write test program
 * enter ten double values
 * invoke methods
 * display average value
 */
public class A7dot11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 whole numbers: ");
		double[] myList = new double[10];
		for (int i = 0; i < myList.length; i++)
			myList[i] = input.nextDouble();
		System.out.println("The mean is: " + mean(myList));
		System.out.println("The standard deviation is: " + deviation(myList));
	}
	public static double mean(double[]array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];			
		}
		return total /10;
	}
		public static double deviation(double[]array) {
			double mean = mean(array);
			double deviation = 0;
			for (int i =0; i< array.length; i++) {
	           deviation += (Math.pow(array[i] - mean, 2));
	        }
	    deviation /= (array.length - 1);   
		return Math.sqrt(deviation);
    }
}
		