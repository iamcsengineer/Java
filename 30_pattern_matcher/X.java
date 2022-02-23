import java.util.regex.*;

class X{
	public static void main(String[] args){
		//Case 1:
		//Pattern p = Pattern.compile(".*xx");
		
		//Case 2:
		Pattern p = Pattern.compile(".*?xx");
		
		Matcher m = p.matcher("q10xx_34rt2xx789");
		
		System.out.println("q10xx_34rt2xx789");
		
		while(m.find()){
			System.out.println(">"+m.group()+"< # start_index: "+m.start()+"~ end_index: "+m.end());
		}
	}
}