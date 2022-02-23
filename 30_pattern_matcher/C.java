import java.util.regex.Pattern;
import java.util.regex.Matcher;

class C{
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");

		Matcher m = p.matcher("mohan is a mohan boy and mohan is reading mohan book");
		
		System.out.println("mohan is a mohan boy and mohan is reading mohan book");
		while(m.find()){
			System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
		}
	}
}