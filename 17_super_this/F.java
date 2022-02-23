class X{
	int a = 89;
}

class F{
	int a = 99;

	static void pro(){
		System.out.println(this.a);	
		System.out.println(super.a);	
	}
}