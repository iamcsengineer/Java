import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ZC{
	public static void main(String[] args){
		Pattern p = Pattern.compile("([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})");
		Matcher m = p.matcher("name: amit singh, email: amit_singh.rajpoot@gmail.co.in, age: 21, Degree: BE, Sem: 4th # name: vivek sahu, email: vivek.sahu1234@rediffmai.com, age: 20, Degree: BTech, Sem: 2nd # name: mohan kumar, email: mohan12_.234@outlook.com, age: 23, Degree: BE, Sem: 8th a@b.c");

		System.out.println("name: amit singh, email: amit_singh.rajpoot@gmail.co.in, age: 21, Degree: BE, Sem: 4th # name: vivek sahu, email: vivek.sahu1234@rediffmai.com, age: 20, Degree: BTech, Sem: 2nd # name: mohan kumar, email: mohan12_.234@outlook.com, age: 23, Degree: BE, Sem: 8th a@b.c");
		
		while(m.find()){
			System.out.println(">"+m.group()+"<");
		}
	}
}