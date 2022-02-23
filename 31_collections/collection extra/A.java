import java.util.ArrayList;

class A{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(45);
		list.add(67);
		list.add(23);

		System.out.println(list);

		Object[] arr = list.toArray();

		System.out.println(arr);

		for(Object o : arr){
			System.out.println(o);
		}
	}
}