import java.util.Calendar;
import java.util.Date;

class F {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);		

		//cal.add(Calendar.DATE,-5);
		cal.add(Calendar.MONTH,1);
		
		dt = new Date(cal.getTimeInMillis());
		System.out.println(dt);		
	}
}
