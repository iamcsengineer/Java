import java.util.ArrayList;

class K{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		a.add(45);
		a.add(32);
		a.add(59);
		a.add(62);
		a.add(12);
		

		System.out.println(a);

		//System.out.println(a.remove(62));		
		System.out.println(a.remove(new Integer(62)));		

		System.out.println(a);
	}
}