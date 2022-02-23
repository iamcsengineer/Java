import java.util.regex.Pattern;

class A{
	public static void main(String[] args){
		Pattern pattern = Pattern.compile("hello");

		System.out.println(pattern);
		System.out.println(pattern.pattern());
	}
}