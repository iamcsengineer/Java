class A{
	A(){
		System.out.println("A() "+this);
	}
}

class B extends A{
	B(){
		System.out.println("B() "+this);
	}
}

class C extends B{
	C(){
		System.out.println("C() "+this);	
	}
}

class K{
	public static void main(String[] args){
		C x = new C();
		System.out.println(x);

		System.out.println("###################");

		B y = new B();
		System.out.println(y);
	}
}