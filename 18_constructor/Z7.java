class X{
	X(int i){
		
	}
}

class Z7 extends X{
	int a = 9;

	Z7(){
		super(a);
		System.out.println(a)
	}

	public static void main(String[] args){
		Z7 w = new Z7();
	}
}