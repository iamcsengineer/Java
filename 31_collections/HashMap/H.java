import java.util.HashMap;

class H{
	public static void main(String[] args){
		HashMap map = new HashMap();

		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		map.put("mohan",12);
		map.put("sohan",16);
		map.put("rohan",18);
		map.put("gohan",13);

		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
	}
}