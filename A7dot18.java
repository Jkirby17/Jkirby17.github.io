import java.util.Scanner;

/*
 * create the scanner
 * prompt for 10 number
 * create an array
 * read the numbers into an array
 * sort the numbers
 * print the numbers
 */
public class A7dot18 {

	public static void main(String[] args) {
		double [] list = getlist();
		sortList(list);
		printList(list);

	}
	private static double[] getlist() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 numbers: ");
		double[] list = new double[10];
		for (int i = 0; i < list.length; i++) {
				list[i] = input.nextDouble();
	}
	return list;
}
	private static void sortList(double[] list) {
		for(int i = 0; i <list.length; i++) {
			for (int j = 0; j < list.length; j++)
				if (list[j] > list[j + 1]) {
					double t = list[j];
					list[j] = list[j + 1];
					list[j + 1] = t;
				}
		}
	}
	private static void printList(double[] list) {
		for(double val: list) {
			System.out.print(val + "");
		}
}
}
