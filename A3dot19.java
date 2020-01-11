import java.util.Scanner;
/*create a scanner
 * prompt for input
 * get three sides
 * if valid 
 *  find the parameter
 *  display the parameter
 * else
 *  display an error message 
 */
public class A3dot19 {

	public static void main(String[] args) {
		// find the parameter of a triangle
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter three sides of a triangle: ");
       double s1 = input.nextDouble();
       double s2 = input.nextDouble();
       double s3 = input.nextDouble();
       if(s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 >s2) {
    	   double parameter = s1 +s2 +s3;
    	   System.out.print("The parameter is " + parameter);
       } else {
    	   System.out.print("That is not a valid triangle");
       }
       input.close();
	}

}
