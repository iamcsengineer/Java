class F{
	class X{

	}

	public static void main(String[] args){
		//Case 6:
		//X x = new F().new X();
		
		//Case 5:
		//F f = new F();
		//F.X x = f.new X();

		//Case 4:
		//F f = new F();
		//X x = f.new X();
		
		//Case 3:
		//X x = this.new X();	
		
		//Case 2:
		//X x = new X();

		//Case 1:
		//X x;
	}
}