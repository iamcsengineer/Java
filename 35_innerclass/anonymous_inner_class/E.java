class X{
	void mno(){
		System.out.println("ram");
	}
}

class E{
	X x = new X(){
				void mno(){
					System.out.println("shyam");
				}
			  };

	public static void main(String[] args){
		E e = new E(); 
		
		e.x.mno();

		System.out.println("hi");
	}
}