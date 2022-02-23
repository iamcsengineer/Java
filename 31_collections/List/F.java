import java.util.ArrayList;

class F{
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(12);
		a.add(45);
		a.add(78);
		a.add(52);
		a.add(34);
		
		//Integer i = a.get(2);
		//or
		Integer i = a.get(5);

		System.out.println(a.size());
	}
}