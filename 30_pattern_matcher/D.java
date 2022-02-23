import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\d");

		Matcher m = p.matcher("mohan is 18 and in class 5th");
		
		System.out.println("mohan is 18 and in class 5th");
		while(m.find()){
			System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
		}
	}
}