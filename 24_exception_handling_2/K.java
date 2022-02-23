class K{
	public static void main(String[] args){
		try{
			pro();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

		System.out.println("-----2");
	}

	static void pro(){
		try{
			int w = 12/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
			throw new NumberFormatException();
		}

		System.out.println("----- 1");
	}
}