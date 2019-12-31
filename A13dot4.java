import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class A13dot4 {

	public static void main(String[] args) {
		int month = 0;
		int year = 0;
		GregorianCalendar cal;
		if (args.length == 2) {
			month = Integer.parseInt(args[0]) - 1;
			year = Integer.parseInt(args[1]);
		} else {
			cal = new GregorianCalendar();
			if (args.length == 1) {
			month = Integer.parseInt(args[0]) - 1;
			} else {
				month = cal.get(Calendar.MONTH);
			}
				year = cal.get(Calendar.YEAR);
		}
		cal = new GregorianCalendar(year, month, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		String monthName = new SimpleDateFormat("MMM").format(cal.getTime());
		
		System.out.println("    " + monthName +"," + year);
		System.out.println("------------------------");
		System.out.println(" Sun Mon Tue Wed The Fri Sat");
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("   ");
		}
		for(int i = 1; i <=daysInMonth; i++) {
			System.out.printf("%4d", i);
			if((dayOfWeek + i -1 ) %7 ==0) {
				System.out.println();

			}

		}
	}

}
