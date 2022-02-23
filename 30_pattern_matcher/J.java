import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("abc 123\t456\nmno\r");
		
		System.out.println("abc 123\\t456\\nmno\\r");
		
		while(m.find()){
			System.out.println(">"+m.group()+"<"+m.start()+"~"+m.end());
		}

		System.out.println("mohan\rram");
	}
}