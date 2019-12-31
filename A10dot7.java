import java.util.Scanner;

/*
 * create scanner
 * create an array
 * create ten accounts 
 * loop
 * prompt id
 * get id
 * if the id is valid
 * access the account
 * loop
 * display the menu
 * get choice 
 * if 1 display balance
 * if 2 ask for amount and withdraw
 * if 3 ask for amount and deposit
 * if 4 exit loop
 * end loop
 * end loop
 */
public class A10dot7 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	Account[] a = new Account[10];
	int id;
	for (id = 0; id < a.length; id++) {
		a[id] = new Account(id, 100.00);
	}
	do {
		System.out.print("Please enter your id: ");
		id = input.nextInt();
		if (id >= 0 && id < a.length) {
			drawMenu(a[id]);
		}
		else {
			System.out.println("Invalid Id. ");
		}
	}while (id >= 0);
	}
	private static void drawMenu(Account a) {
		int choice = 0;
		do {
		System.out.println("Main Menu");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
		System.out.println("Enter a choice: ");
		choice = input.nextInt();
		switch (choice) {
		case 1: 		System.out.printf("The Balance is $%.2f%n", a.getBalance());
		}
		} while (choice != 4);

		}
	}
