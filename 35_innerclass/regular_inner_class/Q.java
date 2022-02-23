class Q extends Z{
	int y = 90;

	class X extends Y{
		//int y = 91;
		void abc(){
			//int y = 92;
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		Q p = new Q();
		X x = p.new X();
		x.abc();
	}
}

class Y{
	int y = 100;
}

class Z{
	int y = 120;
}