class A{
	static int y = 30;
}

class B extends A{
	static int y = 50;
}

class X{
	public static void main(String[] args){
		A x = new B();
		System.out.println(x.y);
	}
}