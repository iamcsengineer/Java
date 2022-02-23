class X{
	//int a = 9;
	
	/*
	void abc(){
		System.out.println("abc() in X");
	}*/
}

class Y extends X{
	int a = 12;

	void abc(){
		System.out.println("abc() in Y");
	}

	void pro(){
		System.out.println(this.a);
		System.out.println(super.a);
		this.abc();
		super.abc();
	}
}

class L{
	public static void main(String[] args){
		Y y = new Y();

		y.pro();
	}
}