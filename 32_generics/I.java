import java.util.*;

class I{
	public static void main(String[] args){
		ArrayList a = new ArrayList();
		
		a.add("mohan");
		a.add("rohan");
		a.add("sohan");

		Iterator i = a.iterator();
		while(i.hasNext()){
			//String x = i.next();
			String x = (String)i.next();
			System.out.println(x);
		}
	}
}