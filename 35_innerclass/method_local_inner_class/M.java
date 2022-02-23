class M{
	static private int w = 320;

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
		M.abc();
	}
}