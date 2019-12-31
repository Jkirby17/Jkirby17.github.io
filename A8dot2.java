/*
 * a method that sums all the numbers in the major diagonal 
 * on the major diagonal in an n x n matrix of double values
 */
import java.util.Scanner;

public class A8dot2 {
	public static void main(String[] args) {
		double[][] matrix = getMatrix();
		System.out.println("Sum of the elemnets in the major diagonal is " + sumMajorDiagonal(matrix));
	}
	
	public static double[][] getMatrix(){
		Scanner input = new Scanner(System.in);
		final int ROWS = 4;
		final int COLS = 4;
		double [][] m = new double[ROWS][COLS];

		System.out.println("Please enter a 4-by-4 matrix row by row: ");
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				m[row][col] = input.nextDouble();
			}
		}
		return m;
	}
		public static double sumMajorDiagonal (double[][] m) {
			double sum = 0;
			for (int i = 0; i < m.length; i++) {
				sum += m[i][i];

				}
			return sum;

			}

		}

