class G{
	private static int y = 32;

	static class X{
		private void pro(){
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		X x = new G.X();
		x.pro();
	}
}