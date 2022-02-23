import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\w\\w");

		Matcher m = p.matcher("#@2$_3%a&F3");
		
		System.out.println("#@2$_3%a&F3");
		while(m.find()){
			System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
		}
	}
}