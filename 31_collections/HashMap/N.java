import java.util.HashMap;
import java.util.Set;

class N{
	public static void main(String[] args){
		HashMap<String,Integer> map = new HashMap<String,Integer>();
	
		map.put("mohan",12);
		map.put("sohan",16);
		map.put("rohan",18);
		map.put("gohan",13);
		
		Set<String> set = map.keySet();
		for(String o : set){
			System.out.println(o+"~"+map.get(o));
		}
	}
}