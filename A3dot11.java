//This program will have the month and year entered and will display how many days that month had.
import java.util.Scanner;

public class A3dot11 {

	public static void main(String[] args) {
		// 

  Scanner input = new Scanner(System.in);

   System.out.println("Enter a month (1-12): ");
    int month = input.nextInt();
   
    System.out.println("Enter a year: ");
    int year = input.nextInt();
    
//compute how many days were in that month and year

     switch (month){
       case 1 : System.out.println(" January had 31 days "); break; 
       case 2 :
    	   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    		   System.out.println(" February had 29 days " + year); 
    	   }
    	   else {
    		   System.out.println(" February had 28 days " + year); 
    	   } break;    	
       case 3 : System.out.println("March had 31 days "+ year); break; 
       case 4 : System.out.println("April  had 30 days"+ year); break; 
       case 5 : System.out.println("May had 31 days"+ year); break; 
       case 6 : System.out.println("June had 30 days"+ year); break; 
       case 7 : System.out.println("July had 31 days"+ year); break; 
       case 8 : System.out.println("August had 31 days"+ year); break; 
       case 9 : System.out.println("September had 30 days"+ year); break; 
       case 10 : System.out.println("October had 31 days"+ year); break; 
       case 11 : System.out.println("November had 30 days"+ year); break; 
       case 12 : System.out.println("December had 31 days"+ year); break; 
               
       }
    
     }
}