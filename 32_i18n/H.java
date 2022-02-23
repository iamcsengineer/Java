import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class H {
	public static void main(String[] args) {
		Locale loc = new Locale("de","DE");
		System.out.println(loc.getDisplayLanguage());
		System.out.println(loc.getDisplayCountry());			
	}
}
