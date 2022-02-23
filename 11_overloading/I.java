class I{
	static void abc(int a){
		System.out.println("int");
	}

	static void abc(boolean x){
		System.out.println("boolean");
	}

	public static void main(String[] args){
		//abc(12);

		//abc(true);

		//abc(12.2f);

		byte x = 20;
		abc(x);
	}
}