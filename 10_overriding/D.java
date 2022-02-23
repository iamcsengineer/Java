class A{
	static void abc(){
		System.out.println("abc() in A ~");
	}
}

class B extends A{
	//Just a Method Redefinition
	static void abc(){
		System.out.println("abc() in B ~");
	}
}

class D{
	public static void main(String[] args){
		//Case 3:
		//A x = new B();
		//x.abc();
		
		//Case 2:
		//B x = new B();
		//x.abc();
		
		//Case 1:
		//A x = new A();
		//x.abc();
	}
}