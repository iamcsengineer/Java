import java.util.TreeSet;
import java.util.SortedSet;

class B{
	public static void main(String[] args){
		TreeSet set = new TreeSet();
		
		set.add("mohan");
		set.add("rohan");
		set.add("gohan");
		set.add("tohan");
		set.add("sohan");

		//SortedSet ss = set.headSet("nohan");
		//SortedSet ss = set.tailSet("nohan");
		SortedSet ss = set.tailSet("rohan");
		
		System.out.println(ss);
	}
}