class L{
	int y = 92;

	void abc(){
		System.out.println("in outer class L.abc");
	}
	
	class M{
		void pro(){
			System.out.println(y);
			abc();
		}
	}

	public static void main(String[] args){
		L l = new L();
		M m = l.new M();
		m.pro();
	}
}