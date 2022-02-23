class F{
	private static int y = 32;

	static class X{
		void pro(){
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		X x = new F.X();
		x.pro();
	}
}