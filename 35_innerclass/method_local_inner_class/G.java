class G{
	void abc(){
		class X{
			void pro(){
				System.out.println("Hello");
			}
		}

		X x = new X();
		x.pro();
	}

	public static void main(String[] args){
		G x = new G();
		x.abc();
	}
}