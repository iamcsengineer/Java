class A{
	int x = 12;
}

class B extends A{
	int x = 23;

	public static void main(String[] args){
		B b = new B();
		
		System.out.println(b.x);
	}
}