import java.util.Collections;
import java.util.ArrayList;

class A{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		//Case 2:
		list.add("raghu");
		list.add("yati");
		list.add("ghatotkatch");
		list.add("kamlesh");
		list.add("balveer");

		//Case 1:
		/*
		list.add(67);
		list.add(45);
		list.add(32);
		list.add(89);
		list.add(23);
		*/

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}