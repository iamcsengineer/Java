import java.util.HashMap;
import java.util.Set;

class L{
	public static void main(String[] args){
		HashMap map = new HashMap();
	
		map.put("mohan",12);
		map.put("sohan",16);
		map.put("rohan",18);
		map.put("gohan",13);
		
		Set set = map.keySet();
		System.out.println(set);
	}
}