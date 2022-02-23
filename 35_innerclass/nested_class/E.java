class E{
	static int y = 56;

	static class X{
		void pro(){
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		X x = new E.X();
		x.pro();
	}
}