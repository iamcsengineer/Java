import java.util.TreeMap;
import java.util.SortedMap;

class B{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("mohan",23);
		map.put("raghu",12);
		map.put("vijay",9);
		map.put("yogesh",10);
		map.put("aman",15);

		//SortedMap sm = map.headMap("sateesh");
		//SortedMap sm = map.tailMap("sateesh");
		SortedMap sm = map.tailMap("raghu");

		System.out.println(sm);
	}
}