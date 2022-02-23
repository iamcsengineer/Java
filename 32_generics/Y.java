import java.util.*;

interface A{ }
class B implements A{ }

class X{
	public static void main(String[] args){
		ArrayList<? extends A> l1 = new ArrayList<B>();
		
	}
}