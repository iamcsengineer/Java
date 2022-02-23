class A{
	int y = 90;
}

class B extends A{
	int y = 100;
}

class X{
	public static void main(String[] args){
		A x = new B();
		System.out.println(x.y);
	}
}