class J{
	private int w = 78;

	void abc(){
		class X{
			private void pro(){
				System.out.println(w);
			}
		}

		X x = new X();
		x.pro();
	}

	public static void main(String[] args){
		J x = new J();
		x.abc();
	}
}