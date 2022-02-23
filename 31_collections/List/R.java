import java.util.ArrayList;
import java.util.Iterator;

class R{
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();

		a.add("mohan");
		a.add("gohan");
		a.add("eohan");
		a.add("sohan");
		a.add("tohan");

		System.out.println(a);

		Iterator i = a.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}

		System.out.println(a);
	}
}