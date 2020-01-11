import java.util.Scanner;
/*
 * create scanner
 * prompt for three cities
 * compare the first two cities
 * if out of order swap them
 * compare the next two cities
 * if out of order swap them
 * display the sorted cities
 */
public class A4dot24 {

	public static void main(String[] args) {
		// Sort the cities
		Scanner  input = new Scanner(System.in);
		
		System.out.print("Please enter the first City: ");
		String c1 = input.nextLine();
		
		System.out.print("Please enter the second City: ");
		String c2 = input.nextLine();
		
		System.out.print("Please enter the third City: ");
		String c3 = input.nextLine();
		
		if (c1.compareTo(c2) > 0) {
			String t = c2;
			c3 = c2;
			c2 = t;
		}
		if (c2.compareTo(c3) > 0) {
			String t = c3;
			c3 = c2;
			c2 = t;
		}
	
	if (c1.compareTo(c2) > 0) {
		String t = c2;
		c2 = c1;
		c1 = t;
	}
	System.out.println("The three cities are " + c1 + "" + c2 +"" + c3);
}

}
