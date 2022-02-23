class P{
	int y = 90;

	class X{
		//int y = 91;
		void abc(){
			//int y = 92;
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		P p = new P();
		X x = p.new X();
		x.abc();
	}
}