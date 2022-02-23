class X{
	private X(){
	
	}	

	static X createObject(){
		X x = new X();
		return x;
	}
}

class Z{
	public static void main(String[] args){
		X x = X.createObject();
	}
}