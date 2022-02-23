class A{
	static void abc(){
		System.out.println("static abc() in A");
	}
}

class B extends A{
	static void abc(){
		System.out.println("static abc() in B");
	}
}

class X{
	public static void main(String[] args){
		A y = new B();
		y.abc();
	}
}