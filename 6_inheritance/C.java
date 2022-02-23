class X{
	void pro(){
		System.out.println("Inside X");
	}
}

class C extends X{
	public static void main(String[] args){
		C a = new C();

		//a.abc();
		//a.pro();

		a.toString();
	}
}