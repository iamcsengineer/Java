interface X{
	void abc();
}

class Y implements X{
	public void abc(){
		System.out.println("Hola");
	}
}

class B{
	public static void main(String[] args){
		X x = new Y();
		x.abc();

		System.out.println("hi");
	}
}