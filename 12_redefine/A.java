class A{
	void abc(){
		System.out.println("abc in A");
	}
}

class B extends A{
	void abc(){
		System.out.println("abc in B");
	}
}

class X {
	public static void main(String[] args){
		A y = new B();

		y.abc();
	}
}