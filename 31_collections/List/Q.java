import java.util.ArrayList;

class Q{
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();

		a.add("mohan");
		a.add("rohan");
		a.add("sohan");
		a.add("gohan");
		a.add("tohan");

		System.out.println(a);

		for(String s : a){
			System.out.println(s);
		}
		
		System.out.println(a);
	}
}