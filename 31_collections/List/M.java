import java.util.ArrayList;

class M{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		a.add("mohan");
		a.add("rohan");
		a.add("sohan");
		a.add("gohan");

		System.out.println(a);

		//a.add(2,"tohan");
		//or
		a.set(2,"tohan");

		System.out.println(a);
	}
}