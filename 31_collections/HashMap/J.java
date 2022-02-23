import java.util.HashMap;

class J{
	public static void main(String[] args){
		HashMap map = new HashMap();
	
		map.put("mohan",12);
		map.put("sohan",16);
		map.put("rohan",18);
		map.put("gohan",13);

		System.out.println(map);
		System.out.println(map.put("gohan",100));
		System.out.println(map);
	}
}