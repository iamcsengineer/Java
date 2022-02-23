class N{
	private int y = 120;

	private void abc(){
		System.out.println("in outer class N.abc Hello");
	}
	
	class M{
		void pro(){
			System.out.println(y);
			abc();
		}
	}

	public static void main(String[] args){
		N l = new N();
		M m = l.new M();
		m.pro();
	}
}