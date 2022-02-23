import java.util.regex.Pattern;
import java.util.regex.Matcher;

class V{
	public static void main(String[] args){
		Pattern p = Pattern.compile("aba");
		Matcher m = p.matcher("abababa");
		
		System.out.println("abababa");
		
		while(m.find()){
			System.out.println(">"+m.group()+"< # start_index: "+m.start()+"~ end_index: "+m.end());
		}
	}
}