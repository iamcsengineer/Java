class I{
	void abc(){
		class X{
			private void pro(){
				System.out.println("Hello");
			}
		}

		X x = new X();
		x.pro();
	}

	public static void main(String[] args){
		I x = new I();
		x.abc();
	}
}