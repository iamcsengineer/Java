class A{
	void abc1(){
		System.out.println("abc1 method in A");
	}
}

class E extends A{

}

class B extends A{
	void abc2(){
		System.out.println("abc2 method in B");
	}
}

class C extends B{
	void abc3(){
		System.out.println("abc3 method in C");
	}
}

class Y{
	public static void main(String[] args){
		//Case 4:
		/*
		Object o = new C();
		//o.abc3();
		//o.abc2();
		//o.abc1();
		System.out.println(o.toString());
		*/

		//Case 3:
		/*
		A a = new C();
		//a.abc3();
		//a.abc2();
		a.abc1();
		System.out.println(a.toString());
		*/

		//Case 2:
		/*
		B b = new C();
		//b.abc3();
		b.abc2();
		b.abc1();
		System.out.println(b.toString());
		*/

		//Case 1:
		/*
		C c = new C();
		c.abc3();
		c.abc2();
		c.abc1();
		System.out.println(c.toString());
		*/
	}
}
