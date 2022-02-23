class A{

}

class E extends A{

}

class B extends A{
	
}

class C extends B{
	
}

class X{
	public static void main(String[] args){
		//Polymorphic Assignment
		C c = new C();

		B b = new C();

		A a = new C();

		Object o = new C();

		//E e = new C();
	}
}
