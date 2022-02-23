class F{
	public static void main(String[] args){
		D.abc();
	}
}

class D{
	static void abc(){
		C.xyz();
	}
}

class C{
	static void xyz(){
		B.mno();
	}
}

class B{
	static void mno(){
		int a = 12/0;
	}
}