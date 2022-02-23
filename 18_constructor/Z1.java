class X{
	static X a = new X();

	private X(){
	
	}
}

class Z1{
	public static void main(String[] args){
		//X y = new X();

		X y = X.a;
	} 
}