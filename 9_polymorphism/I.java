interface A{

}

interface B{

}

interface C extends A,B{

}

interface G{

}

class D implements A{

}

class E extends D implements C{

}

class F extends E implements B,G{

}

class I{
	public static void main(String[] args){
		F f = new F();

		System.out.println(f instanceof E);
		System.out.println(f instanceof D);
		System.out.println(f instanceof Object);

		System.out.println(f instanceof B);
		System.out.println(f instanceof G);

		System.out.println(f instanceof C);
		System.out.println(f instanceof B);
		System.out.println(f instanceof A);
	}
}

