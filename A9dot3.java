/*
 * create a Date object
 * put in time
 * print getTime + string
 * print date.to string
 */
public class A9dot3 {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date(10000);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
		java.util.Date date1 = new java.util.Date(100000);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
		//java.util.Date date2 = new java.util.Date(1000000);
		date1.setTime(100000);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date1.toString());
		java.util.Date date3 = new java.util.Date(10000000);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
		java.util.Date date4 = new java.util.Date(100000000);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
		java.util.Date date5 = new java.util.Date(1000000000);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
		java.util.Date date6 = new java.util.Date(10000000000L);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
		java.util.Date date7 = new java.util.Date(100000000000L);
		System.out.println(date.getTime() +"Milsec since Jan 1 takes us to: ");
		System.out.println(date.toString());
	


	}

}
