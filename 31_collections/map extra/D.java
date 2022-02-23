import java.util.TreeMap;
import java.util.NavigableMap;

class D{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("mohan",23);
		map.put("raghu",12);
		map.put("vijay",9);
		map.put("yogesh",10);
		map.put("aman",15);	

		//NavigableMap nm = map.headMap("raghu",false);
		NavigableMap nm = map.headMap("raghu",true);

		System.out.println(nm);
	}
}