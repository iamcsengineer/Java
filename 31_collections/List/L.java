import java.util.ArrayList;

class L{
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(45);
		a.add(32);
		a.add(59);
		a.add(62);
		a.add(12);
		

		System.out.println(a);
		
		Integer w = a.remove(2);

		System.out.println(w);		
		

		System.out.println(a);
	}
}