import java.util.*;

class P{
	public static void main(String[] args){
		ArrayList<String> list = pro();

		list.add("mohan");
		list.add("sohan");
		

		System.out.println(list);
	}

	static ArrayList pro(){
		ArrayList x = new ArrayList();

		x.add(12);
		x.add(2.34);
		x.add(true);

		return x;
	}
}