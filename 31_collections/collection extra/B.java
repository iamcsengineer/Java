import java.util.ArrayList;

class B{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(23);

		System.out.println(list);
		
		Integer[] x = new Integer[0];
		Integer[] arr = list.toArray(x);

		for(Integer i : arr){
			System.out.println(i);
		}
	}
}