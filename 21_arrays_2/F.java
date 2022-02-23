interface X{

}

class Y implements X{ }
class Z implements X{ }


class F{
	public static void main(String[] args){
		//Case 4:
		X[] w = {new Y(),new Z()};

		//Case 3:
		//X x = new Y();
		
		//Case 2:
		//X x = new X();
		
		//Case 1:
		//X w;
	}
}