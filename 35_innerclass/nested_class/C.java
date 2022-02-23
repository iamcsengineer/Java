class C{
	static class X{
		void pro(){
			System.out.println("hiiii");
		}
	}

	public static void main(String[] args){
		X x = new C.X();
		x.pro();
	}
}