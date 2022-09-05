package swing;
import java.util.*;
public class CalendarDemo {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		System.out.println("YEAR: " + now.get(Calendar.YEAR));
		System.out.println("MONTH: " + now.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + now.get(Calendar.DATE));
		System.out.println("DAY_OF_MONTH: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("AM_PM: " + now.get(Calendar.AM_PM));
		System.out.println("HOUR: " + now.get(Calendar.HOUR));
		System.out.println("HOUR_OF_DAY: " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + now.get(Calendar.MINUTE));
		System.out.println("SECOND: " + now.get(Calendar.SECOND));
		System.out.println("MILLISECOND: " + now.get(Calendar.MILLISECOND));
		}

}
