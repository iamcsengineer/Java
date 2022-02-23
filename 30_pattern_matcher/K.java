import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[xtwq]");
		Matcher m = p.matcher("hex code of three where question is not clear");
		
		System.out.println("hex code of three where question is not clear");
		
		while(m.find()){
			System.out.println(">"+m.group()+"<"+m.start()+"~"+m.end());
		}
	}
}