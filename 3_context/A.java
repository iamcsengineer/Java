class A{
	int x;
	static int y;

	void pro(){
		System.out.println(x);
	}

	static void abc(){
		System.out.println(y);
	}

	public static void main(String[] args){
		A a = new A();		
		System.out.println(a.x);
		a.pro();
		System.out.println(A.y);
		A.abc();
		abc();
	}
}