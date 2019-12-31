/*
 * create a scanner
 * prompt for integers 
 * read the first number
 * max = number
 * count = 1;
 * while not 0
 * read the next number 
 * if number >  max
 * max = number 
 * count = 1
 * else if number = max 
 * increment count 
 * end loop
 * display max and count
 */

import java.util.Scanner;
public class A5dot41 {

	public static void main(String[] args) {
		// Read integers and find the largest, and count its occurrences 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter numbers followed by 0: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		while (number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
				else if (number == max) {
					count++; 
			}
		}
		System.out.println("The largest number is " + max + " and it occurs " + count +" times.");
		
	}

}
