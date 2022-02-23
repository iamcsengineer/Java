import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ZB{
	public static void main(String[] args){
		Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		Matcher m = p.matcher("amitsingh.rajpoot@gmail.co.in");

		System.out.println("amit_singh.rajpoot@gmail.co.in");
		System.out.println(m.matches());
		System.out.println(m.group());
	}
}