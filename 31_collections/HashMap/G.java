import java.util.HashMap;

class G{
	public static void main(String[] args){
		HashMap map = new HashMap();

		map.put("mohan",12);
		map.put("sohan",16);
		map.put("rohan",18);
		map.put("gohan",13);

		System.out.println(map);
		System.out.println(map.get("rohan"));
		System.out.println(map.get("tohan"));
		System.out.println(map);
	}
}