class L{
	private int w = 120;

	static void abc(){
		class X{
			private void pro(){
				System.out.println(w);
			}
		}

		X x = new X();
		x.pro();
	}

	public static void main(String[] args){
		L.abc();
	}
}