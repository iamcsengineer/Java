import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("abc 123\t456\nmno\r");

		//System.out.println(m.group());
		//System.out.println(m.start());
		System.out.println(m.end());
	}
}