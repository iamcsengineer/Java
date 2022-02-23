import java.util.Collections;
import java.util.ArrayList;

class E{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add("raghu");
		list.add("yati");
		list.add("ghatotkatch");
		list.add("kamlesh");
		list.add("balveer");

		Collections.sort(list);
		//int index = Collections.binarySearch(list,"kamlesh");
		//int index = Collections.binarySearch(list,"yati");
		//int index = Collections.binarySearch(list,"balveer");
		//int index = Collections.binarySearch(list,"utkarsh");
		int index = Collections.binarySearch(list,"hitesh");
	
		System.out.println(index);
	}
}