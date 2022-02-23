class O{	
	class M{
		private void pro(){
			System.out.println("Hello Ji");			
		}
	}

	public static void main(String[] args){
		O l = new O();
		M m = l.new M();
		m.pro();
	}
}