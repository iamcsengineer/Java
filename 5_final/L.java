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

class L extends X{
	/*
	void mno(){
		System.out.println("---- inside mno() -----");
	}*/

	void abc(){
		System.out.println("---- inside abc() -----");
	}

	public static void main(String[] args){
		L l = new L();
		l.abc();
	}
}

