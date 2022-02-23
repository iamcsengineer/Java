import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ZA{ 
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is in class 12th and mohan is a good boy");
		//Matcher m = p.matcher("mohan");
		
		//System.out.println("mohan is in class 12th and mohan is a good boy");
		
		//Case 3:
		/*
		System.out.println(m.matches());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		System.out.println(m.matches());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		System.out.println(m.matches());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		*/

		//Case 2:
	
		System.out.println(m.lookingAt());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		System.out.println(m.lookingAt());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		System.out.println(m.lookingAt());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		

		//Case 1:
		/*
		System.out.println(m.find());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		System.out.println(m.find());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());
		System.out.println(m.find());
		System.out.println(m.group()+"~"+m.start()+"~"+m.end());*/
	}
}