import java.util.*;

class J{
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("mohan");
		a.add("rohan");
		a.add("sohan");

		Iterator<String> i = a.iterator();
		while(i.hasNext()){
			String x = i.next();
			
			System.out.println(x);
		}
	}
}