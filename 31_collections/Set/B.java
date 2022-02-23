import java.util.HashSet;
import java.util.Iterator;

class B{
	public static void main(String[] args){
		HashSet<String> s = new HashSet<String>();

		s.add("mohan");
		s.add("rohan");
		s.add("sohan");
		s.add("tohan");
		s.add("gohan");
		s.add("rohan");

		//System.out.println(s);

		//Case 1:
		/*
		Iterator i = s.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}*/

		//Case 2:
		for(String o : s){
			System.out.println(o.length());
		}
	}
}