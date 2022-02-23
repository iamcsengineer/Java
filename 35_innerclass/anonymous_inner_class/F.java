class X{
	void mno(){
		System.out.println("ram");
	}
}

class F{
	X x = new X(){
				void mno(){
					System.out.println("shyam");
				}

				void pqr(){
					System.out.println("ritik");
				}
			  };

	public static void main(String[] args){
		F e = new F(); 
		
		e.x.mno();
		e.x.pqr();

		System.out.println("hi");
	}
}