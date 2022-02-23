class A{
	void abc(){
		System.out.println("abc() in A");
	}
}

class B extends A{
	void abc(){
		System.out.println("abc() in B");
	}
}

class C{
	public static void main(String[] args){
		//Case 3:
		A x = new B(); //Polymorphic Assignment
		x.abc(); //Dynamic Method Dispatch or Runtime Polymorphism
		//Polymorphic Method Invocation
		
		//Case 2:
		//B x = new B();
		//x.abc();


		//Case 1:
		//A x = new A();
		//x.abc();
	}
}