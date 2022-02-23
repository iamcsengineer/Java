/*final*/ class X{
	void abc(){
		System.out.println("inside abc()");
	}

	final void mno(){
		System.out.println("inside mno()");
	}

	void pqr(){
		System.out.println("inside pqr()");
	}
}

class K extends X{
	public static void main(String[] args){
		K k = new K();
		
		k.abc();
		k.mno();
		k.pqr();
	}
}

