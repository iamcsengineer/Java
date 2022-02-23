import java.util.*;

class R{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		pro(list);
		
		ArrayList<Long> list2 = new ArrayList<Long>();
		list2.add(34L);
		list2.add(53L);
		pro(list2);
	}

	static void pro(ArrayList<Number> x){
		System.out.println(x);
	}
	
	/*
	static void pro(ArrayList<Integer> x){
		System.out.println(x);
	}

	static void pro(ArrayList<Long> y){
		System.out.println(y);
	}*/
}