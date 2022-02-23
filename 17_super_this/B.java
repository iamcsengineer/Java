class A{
	int x = 120;
}

class B extends A{
	int x = 230;
	
	void pro(){
		System.out.println(x);
	}

	public static void main(String[] args){
		B b = new B();
		
		b.pro();
	}
}