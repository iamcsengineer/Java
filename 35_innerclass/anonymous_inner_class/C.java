interface X{
	void abc();
}

/*
class Y implements X{
	public void abc(){
		System.out.println("Hola");
	}
}*/

class C{
	public static void main(String[] args){
		X x = new X(){
				public void abc(){
					System.out.println("sohan");
				}
			  };
		
		x.abc();

		System.out.println("hi");
	}
}