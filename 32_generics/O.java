import java.util.*;

class O{
	public static void main(String[] args){
		ArrayList x = pro();

		x.add(12);
		x.add(2.34);
		x.add(true);

		System.out.println(x);
	}

	static ArrayList<String> pro(){
		ArrayList<String> list = new ArrayList<String>();

		list.add("mohan");
		list.add("sohan");

		return list;
	}
}