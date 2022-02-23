import java.util.HashMap;

class F{
	public static void main(String[] args){
		//HashMap map = new HashMap();
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		map.put("mohan",12);
		map.put(true,2.34);
		map.put("rohan",18);
		map.put(new E(),'A');

		System.out.println(map);
	}
}