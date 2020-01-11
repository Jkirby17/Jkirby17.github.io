import java.util.InputMismatchException;
import java.util.Scanner;
public class A12dot5 {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter three sides: ");
			double s1 = input.nextDouble();
			double s2 = input.nextDouble();
			double s3 = input.nextDouble();
			MyTriangle  t = new MyTriangle(s1, s2, s3);
			System.out.println(t);
		} catch (IllegalTriangleException e) {
			System.out.println("This is not a valid triangle.");
		}catch (InputMismatchException e) {
			System.out.println("Please enter three numbers: ");
		}
	}

}

class MyTriangle{
	double s1, s2, s3;

	MyTriangle(double s1, double s2, double s3) throws IllegalTriangleException {
		if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 +s1 <= s2) {
			throw new IllegalTriangleException();
		}
		this.s1 =s1;
		this.s2 =s2;
		this.s3 =s3;

	}
	public String toString() {
		return "Triangle with sides: "+ s1 + " " + s2 +" "+ s3;
	}
}

class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {
		// super triangle error
	}
}





