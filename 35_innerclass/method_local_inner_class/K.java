class K{
	static private int w = 100;

	void abc(){
		class X{
			private void pro(){
				System.out.println(w);
			}
		}

		X x = new X();
		x.pro();
	}

	public static void main(String[] args){
		K x = new K();
		x.abc();
	}
}