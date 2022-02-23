import java.util.*;

class V{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		pro(list);
	}

	static void pro(ArrayList<? extends Number> list){
		System.out.println(list);

		//list.add(12);
		//System.out.println(list.get(0));
		//System.out.println(list.remove(0));
		//list.set(1,14);
		
		System.out.println(list);
	}
}