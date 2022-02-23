import java.util.regex.Pattern;
import java.util.regex.Matcher;

class U{
	public static void main(String[] args){
		Pattern p = Pattern.compile("aaa");
		Matcher m = p.matcher("aaaaaa");
		
		System.out.println("aaaaaa");
		
		while(m.find()){
			System.out.println(">"+m.group()+"< # start_index: "+m.start()+"~ end_index: "+m.end());
		}
	}
}