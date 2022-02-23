class A{
	int x = 5;
}

class B extends A{
	int x = 9;
	
	void pro(){
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args){
		B b = new B();
		
		b.pro();
	}
}