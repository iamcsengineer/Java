import java.util.TreeMap;

class C{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("mohan",23);
		map.put("raghu",12);
		map.put("vijay",9);
		map.put("yogesh",10);
		map.put("aman",15);	

		//System.out.println(map.ceilingKey("sateesh"));
		//System.out.println(map.ceilingKey("sateesh"));
		System.out.println(map.floorKey("sateesh"));
	}
}