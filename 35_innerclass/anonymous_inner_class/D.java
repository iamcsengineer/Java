abstract class X{
	abstract void mno();
}

class D{
	public static void main(String[] args){
		X x = new X(){
				public void mno(){
					System.out.println("tohan");
				}
			  };
		
		x.mno();

		System.out.println("hi");
	}
}