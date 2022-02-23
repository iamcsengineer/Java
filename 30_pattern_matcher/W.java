import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W{
	public static void main(String[] args){
		Pattern p = Pattern.compile("a.b");
		Matcher m = p.matcher("qa b5y 2a_by4 poaxby 23a3bop");
		
		System.out.println("qa b5y 2a_by4 poaxby 23a3bop");
		
		while(m.find()){
			System.out.println(">"+m.group()+"< # start_index: "+m.start()+"~ end_index: "+m.end());
		}
	}
}