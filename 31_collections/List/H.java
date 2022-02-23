import java.util.ArrayList;

class H{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		a.add(1.23);
		a.add(67.4);
		a.add(23.32);

		System.out.println(a);
		
		Double d = (Double)a.get(2);
		
		System.out.println(a);
		
	}
}