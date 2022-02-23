class X{
	X(int i){
		
	}
}

class Z8 extends X{
	static int a = 9;

	Z8(){
		super(a);
	}

	public static void main(String[] args){
		Z8 w = new Z8();
	}
}