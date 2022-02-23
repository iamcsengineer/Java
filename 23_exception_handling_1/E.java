class E{
	public static void main(String[] args){
		abc();
	}

	static void abc(){
		xyz();
	}

	static void xyz(){
		mno();
	}

	static void mno(){
		int a = 12/0;
	}
}