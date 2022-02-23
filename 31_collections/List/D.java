import java.util.ArrayList;

class D{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(12);
		list.add(2.34);
		list.add("mohan");
		list.add(false);

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		//String str = list.get(2);
		String str = (String)list.get(2);
		System.out.println(str);

		System.out.println(list);
	}
}