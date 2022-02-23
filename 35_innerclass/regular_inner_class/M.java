class M{
	int y;
	
	class N{
		void pro(){
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		M m1 = new M();
		m1.y = 10;
		N n1 = m1.new N();
		
		M m2 = new M();
		m2.y = 20;
		N n2 = m2.new N();

		n1.pro();
		n2.pro();
	}
}