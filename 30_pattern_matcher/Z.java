import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z{ 
	public static void main(String[] args){
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		
		System.out.println(args[1]);
		
		while(m.find()){
			System.out.println(">"+m.group()+"< # start_index: "+m.start()+"~ end_index: "+m.end());
		}
	}
}