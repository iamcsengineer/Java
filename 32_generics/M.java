import java.util.*;

class M{
	public static void main(String... a){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(true);
		list.add("mohan");

		pro(list);
	}

	static void pro(ArrayList<Integer> x){
		x.add(23);
		System.out.println(x);
	}
}