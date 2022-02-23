import java.util.HashSet;

class A{
	public static void main(String[] args){
		HashSet s = new HashSet();
		//or
		//HashSet<Integer> s = new HashSet<Integer>();
		
		//Case 3:
		//System.out.println(s.isEmpty());

		//Case 4:
		System.out.println(s.size());
		
		s.add(12);
		s.add(17);
		s.add(19);
		s.add(11);
		s.add(12);
		
			
		//Case 1,2
		//System.out.println(s);
		
		//Case 1:
		//System.out.println(s.contains(19));

		//Case 2:
		//System.out.println(s.remove(19));
		
		//Case 3:
		//System.out.println(s.isEmpty());

		//Case 4:
		//System.out.println(s.size());
		
		//Case 1,2
		//System.out.println(s);
	}
}