import java.util.*;

class N{
	public static void main(String... a){
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(34);
		list.add(67);

		pro(list);
	}

	static void pro(ArrayList x){
		x.add(true);
		x.add("mohan");
		System.out.println(x);
	}
}