import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;

class E{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("mohan",23);
		map.put("raghu",12);
		map.put("vijay",9);
		map.put("yogesh",10);
		map.put("aman",15);	
		
		Map.Entry entry = map.ceilingEntry("sateesh");
		//System.out.println(map.ceilingEntry("sateesh"));
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());		
	}
}