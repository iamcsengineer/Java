import java.util.TreeSet;
import java.util.NavigableSet;
class D{
	public static void main(String[] args){
		TreeSet set = new TreeSet();
		
		set.add(45);
		set.add(12);
		set.add(67);
		set.add(23);
		set.add(9);
		set.add(34);
		
		//NavigableSet ns = set.headSet(34,false);
		NavigableSet ns = set.headSet(45,true);

		System.out.println(ns);
	}
}