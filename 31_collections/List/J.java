import java.util.ArrayList;

class J{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		a.add(4);
		a.add(3);
		a.add(5);
		a.add(2);
		a.add(1);
		

		System.out.println(a);

		//System.out.println(a.remove(2));
		//or
		Integer i = new Integer(2);
		System.out.println(a.remove(i));

		System.out.println(a);
	}
}