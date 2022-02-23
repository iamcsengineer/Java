class A{
	int q = 90;
}

class B extends A{
	float w = 2.34f;
}

class C extends B{
	boolean e = true;
}

class L{
	public static void main(String[] args){
		C x = new C();

		System.out.println(x.e);
		System.out.println(x.w);
		System.out.println(x.q);
	}
}