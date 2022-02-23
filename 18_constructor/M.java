class A{
	int q;
}

class B extends A{
	float w;
}

class C extends B{
	boolean e;
}

class M{
	public static void main(String[] args){
		C x = new C();

		System.out.println(x.e);
		System.out.println(x.w);
		System.out.println(x.q);
	}
}