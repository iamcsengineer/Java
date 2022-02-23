import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\d\\d");

		Matcher m = p.matcher("mohan is 12 and in class 5th and he scored 3425");
		
		System.out.println("mohan is 12 and in class 5th and he scored 3425");
		while(m.find()){
			System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
		}
	}
}