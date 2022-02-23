import java.util.*;

class G 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		
		/*
		System.out.println("DATE: "+cal.get(Calendar.DATE));
		System.out.println("WEEK_OF_MONTH: "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR: "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("DAY_OF_YEAR: "+cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("ERA: "+cal.get(Calendar.ERA));
		System.out.println("FirstDayOfWeek: "+cal.getFirstDayOfWeek());
		System.out.println((Calendar.SUNDAY==cal.getFirstDayOfWeek())+" ----First Day Of Week: "+cal.getFirstDayOfWeek()); 
		*/

		cal.set(2015, 0, 14);
		System.out.println(new Date(cal.getTimeInMillis()));
	}
}
