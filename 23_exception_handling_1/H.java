class H{
	public static void main(String[] args){
		System.out.println("------1");
		
		try{
			int x = 12/0;
		}catch(ArithmeticException e){
			//System.out.println(e);	
			e.printStackTrace();	
		}


		System.out.println("------2");
	}
}