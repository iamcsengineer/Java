class T{
	void abc(){
		System.out.println("in abc T");
	}

	class X{
		void mno(){
			System.out.println("in mno X");
		}
	}
	
	public static void main(String[] args){
		T t = new T();
		X x = t.new X();
		x.mno();
		//x.abc();
		t.mno();
	}
}