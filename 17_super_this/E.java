class A{
	int x = 5;
}

class B extends A{
	int x = 9;
	
	void pro(){
		int x = 12;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public static void main(String[] args){
		B b = new B();
		
		b.pro();
	}
}