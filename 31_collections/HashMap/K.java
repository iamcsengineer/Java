import java.util.HashMap;

class K{
	public static void main(String[] args){
		HashMap map = new HashMap();
	
		map.put("mohan",12);
		map.put("sohan",16);
		map.put("rohan",18);
		map.put("gohan",13);

		
		//System.out.println(map.containsKey("rohan"));
		System.out.println(map.containsValue(12));
	}
}